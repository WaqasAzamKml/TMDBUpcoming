package com.dozygeek.tmdb.response;

import com.dozygeek.tmdb.models.MovieModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UpcomingMoviesResponse {

    @SerializedName("total_results")
    @Expose
    private int total_results;

    @SerializedName("results")
    @Expose
    private List<MovieModel> moviesList;

    public int getTotal_results() {
        return total_results;
    }

    public List<MovieModel> getMoviesList() {
        return moviesList;
    }

    @Override
    public String toString() {
        return "UpcomingMoviesResponse{" +
                "total_results=" + total_results +
                ", moviesList=" + moviesList +
                '}';
    }
}
