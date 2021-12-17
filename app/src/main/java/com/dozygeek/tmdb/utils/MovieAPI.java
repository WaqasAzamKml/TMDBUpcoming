package com.dozygeek.tmdb.utils;

import com.dozygeek.tmdb.models.MovieModel;
import com.dozygeek.tmdb.response.UpcomingMoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieAPI {

    @GET("upcoming/")
    Call<UpcomingMoviesResponse> getUpcomingMovies(
            @Query("api_key") String api_key,
            @Query("query") String query,
            @Query("page") int page
    );

    @GET("{movie_id}?")
    Call<MovieModel> getMovieByID(
            @Path("movie_id") int movie_id,
            @Query("api_key") String api_key
    );
}
