package com.dozygeek.tmdb.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.dozygeek.tmdb.models.MovieModel;
import com.dozygeek.tmdb.repos.MovieRepo;

import java.util.List;

public class MoviesListViewModel extends ViewModel {

    private MovieRepo movieRepo;

    public MoviesListViewModel() {
        movieRepo = MovieRepo.getInstance();
    }

    public LiveData<List<MovieModel>> getMoviesMutableList() {
        return movieRepo.getMoviesMutableList();
    }

    public void upcomingMoviesAPI(String query, int pageNumber){
        movieRepo.upcomingMoviesAPI(query, pageNumber);
    }
}
