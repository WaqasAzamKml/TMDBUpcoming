package com.dozygeek.tmdb.repos;

import androidx.lifecycle.LiveData;

import com.dozygeek.tmdb.models.MovieModel;
import com.dozygeek.tmdb.request.MoviesAPIClient;

import java.util.List;

public class MovieRepo {
    private static MovieRepo instance;

    private MoviesAPIClient moviesAPIClient;

    public static MovieRepo getInstance(){
        if(instance == null){
            instance = new MovieRepo();
        }
        return instance;
    }

    private MovieRepo(){
        moviesAPIClient = MoviesAPIClient.getInstance();
    }

    public LiveData<List<MovieModel>> getMoviesMutableList() {
        return moviesAPIClient.getMoviesMutableList();
    }

    public void upcomingMoviesAPI(String query, int pageNumber){
        moviesAPIClient.upcomingMoviesAPI(query, pageNumber);
    }
}
