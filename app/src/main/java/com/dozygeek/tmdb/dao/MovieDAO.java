package com.dozygeek.tmdb.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.dozygeek.tmdb.models.MovieModel;

import java.util.List;

@Dao
public interface MovieDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<MovieModel> moviesList);

    @Query("SELECT * FROM movies")
    LiveData<List<MovieModel>> getAllMovies();

    @Query("DELETE from movies")
    void deleteAllMovies();

//    @Query("SELECT * from movies WHERE id==$id")
//    void getMovieByID(int id);
}
