package com.dozygeek.tmdb;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dozygeek.tmdb.adapters.MoviesAdapter;
import com.dozygeek.tmdb.adapters.OnMovieClickListener;
import com.dozygeek.tmdb.models.MovieModel;
import com.dozygeek.tmdb.viewmodels.MoviesListViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMovieClickListener {

//    Button btnMain, btnGetMovie500;
//    TextView tvMain;

    RecyclerView recyclerMain;
    MoviesAdapter moviesAdapter;

    private MoviesListViewModel moviesListViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesListViewModel = new ViewModelProvider(this).get(MoviesListViewModel.class);

        recyclerMain = findViewById(R.id.recyclerMain);

        configRecyclerView();
        observeChanges();
        upcomingMoviesAPI("", 1);
    }

    private void configRecyclerView() {
        moviesAdapter = new MoviesAdapter(this);
        recyclerMain.setAdapter(moviesAdapter);
        recyclerMain.setLayoutManager(new LinearLayoutManager(this));
    }

    private void observeChanges() {
        moviesListViewModel.getMoviesMutableList().observe(this, new Observer<List<MovieModel>>() {
            @Override
            public void onChanged(List<MovieModel> movieModels) {
                if (movieModels != null) {
                    moviesAdapter.setMoviesList(movieModels);
                }
            }
        });
    }

    public void upcomingMoviesAPI(String query, int pageNumber) {
        moviesListViewModel.upcomingMoviesAPI(query, pageNumber);
    }

    @Override
    public void onMovieClick(int position) {
        Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
        intent.putExtra("movie", moviesAdapter.getSelectedMovie(position));
        startActivity(intent);
    }
}