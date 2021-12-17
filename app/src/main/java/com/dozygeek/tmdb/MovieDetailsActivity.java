package com.dozygeek.tmdb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.dozygeek.tmdb.models.MovieModel;
import com.google.android.material.button.MaterialButton;

public class MovieDetailsActivity extends AppCompatActivity {

    TextView tvMovieTitle, tvReleaseDate, tvOverview;
    ImageView imgMoviePoster;
    RatingBar rbMovieRating;
    MaterialButton btnBookTickets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        tvMovieTitle = findViewById(R.id.tvMovieTitle);
        tvReleaseDate = findViewById(R.id.tvReleaseDate);
        tvOverview = findViewById(R.id.tvOverview);
        imgMoviePoster = findViewById(R.id.imgMoviePoster);
        rbMovieRating = findViewById(R.id.rbMovieRating);
        btnBookTickets = findViewById(R.id.btnBookTickets);

        btnBookTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MovieDetailsActivity.this, TicketBookingActivity.class));
            }
        });

        getDataFromIntent();
    }

    private void getDataFromIntent() {
        if (getIntent().hasExtra("movie")) {
            MovieModel movieModel = getIntent().getParcelableExtra("movie");
            tvMovieTitle.setText(movieModel.getTitle());
            tvReleaseDate.setText(movieModel.getRelease_date());
            tvOverview.setText(movieModel.getOverview());
            rbMovieRating.setRating(movieModel.getVote_average()/2);
            Glide.with(this)
                    .load("https://image.tmdb.org/t/p/w500" + movieModel.getPoster_path())
                    .into(imgMoviePoster);
        }
    }
}