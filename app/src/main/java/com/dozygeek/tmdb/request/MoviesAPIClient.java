package com.dozygeek.tmdb.request;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.dozygeek.tmdb.AppExecutors;
import com.dozygeek.tmdb.models.MovieModel;
import com.dozygeek.tmdb.response.UpcomingMoviesResponse;
import com.dozygeek.tmdb.utils.Credentials;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Response;

public class MoviesAPIClient {
    private static MoviesAPIClient instance;
    private MutableLiveData<List<MovieModel>> moviesMutableList;
    private RetrieveMoviesRunnable retrieveMoviesRunnable;

    private MoviesAPIClient() {
        moviesMutableList = new MutableLiveData<>();
    }

    public static MoviesAPIClient getInstance() {
        if (instance == null) {
            instance = new MoviesAPIClient();
        }
        return instance;
    }

    public LiveData<List<MovieModel>> getMoviesMutableList() {
        return moviesMutableList;
    }

    public void upcomingMoviesAPI(String query, int pageNumber) {

        if (retrieveMoviesRunnable != null) {
            retrieveMoviesRunnable = null;
        }

        retrieveMoviesRunnable = new RetrieveMoviesRunnable(query, pageNumber);

        //for fetching movies
        final Future myHandler = AppExecutors.getInstance().getNetworkIO().submit(retrieveMoviesRunnable);

        //for cancelling retrofit - on 4 seconds timeout
        AppExecutors.getInstance().getNetworkIO().schedule(new Runnable() {
            @Override
            public void run() {
                myHandler.cancel(true);
            }
        }, 4000, TimeUnit.MILLISECONDS);
    }

    private class RetrieveMoviesRunnable implements Runnable {
        private String query;
        private int pageNumber;
        boolean cancelRequest;

        public RetrieveMoviesRunnable(String query, int pageNumber) {
            this.query = query;
            this.pageNumber = pageNumber;
            cancelRequest = false;
        }

        @Override
        public void run() {
            try {
                Response response = getUpcomingMovies(query, pageNumber).execute();
                if (cancelRequest) {
                    return;
                }
                if (response.code() == 200) {
                    List<MovieModel> moviesList = new ArrayList<>(((UpcomingMoviesResponse) response.body()).getMoviesList());
                    if (pageNumber == 1) {
                        moviesMutableList.postValue(moviesList);
                    } else {
                        List<MovieModel> currentMovies = moviesMutableList.getValue();
                        currentMovies.addAll(moviesList);
                        moviesMutableList.postValue(currentMovies);
                    }
                } else {
                    String errorMessage = response.errorBody().string();
                    Log.e("TMDB", errorMessage);
                    moviesMutableList.postValue(null);
                }
            } catch (IOException exception) {
                exception.printStackTrace();
                moviesMutableList.postValue(null);
            }
        }

        private Call<UpcomingMoviesResponse> getUpcomingMovies(String query, int pageNumber) {
            return NetService.getMovieAPI().getUpcomingMovies(
                    Credentials.API_KEY,
                    query,
                    pageNumber
            );
        }

        private void cancelRequest() {
            cancelRequest = true;
        }
    }

}
