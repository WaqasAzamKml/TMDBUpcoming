package com.dozygeek.tmdb.databases;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.dozygeek.tmdb.dao.MovieDAO;
import com.dozygeek.tmdb.models.MovieModel;

@Database(entities = MovieModel.class, version = 1)
public abstract class MoviesDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "movies";

    public abstract MovieDAO movieDAO();

    private static volatile MoviesDatabase INSTANCE;

    public static MoviesDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (MoviesDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, MoviesDatabase.class, DATABASE_NAME)
                            .addCallback(callback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    static Callback callback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateAsyncTask(INSTANCE);
        }
    };

    static class PopulateAsyncTask extends AsyncTask<Void, Void, Void>{

        private MovieDAO movieDAO;

        PopulateAsyncTask(MoviesDatabase moviesDatabase){
            movieDAO = moviesDatabase.movieDAO();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            movieDAO.deleteAllMovies();
            return null;
        }
    }
}
