package com.dozygeek.tmdb.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dozygeek.tmdb.R;

public class MoviesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView tvMovieTitle, tvReleaseDate;
    ImageView imgMoviePoster;
    RatingBar rbMovieRating;

    OnMovieClickListener onMovieClickListener;

    public MoviesViewHolder(@NonNull View itemView, OnMovieClickListener onMovieClickListener) {
        super(itemView);

        this.onMovieClickListener = onMovieClickListener;

        tvMovieTitle = itemView.findViewById(R.id.tvMovieTitle);
        tvReleaseDate = itemView.findViewById(R.id.tvReleaseDate);
        imgMoviePoster = itemView.findViewById(R.id.imgMoviePoster);
        rbMovieRating = itemView.findViewById(R.id.rbMovieRating);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        onMovieClickListener.onMovieClick(getAdapterPosition());
    }
}
