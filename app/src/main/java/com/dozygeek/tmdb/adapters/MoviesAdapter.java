package com.dozygeek.tmdb.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.dozygeek.tmdb.R;
import com.dozygeek.tmdb.models.MovieModel;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<MovieModel> moviesList;
    OnMovieClickListener onMovieClickListener;

    public MoviesAdapter(OnMovieClickListener onMovieClickListener) {
        this.onMovieClickListener = onMovieClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_item, parent, false);
        return new MoviesViewHolder(view, onMovieClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((MoviesViewHolder) holder).tvMovieTitle.setText(moviesList.get(position).getTitle());
        ((MoviesViewHolder) holder).tvReleaseDate.setText(moviesList.get(position).getRelease_date());
        ((MoviesViewHolder) holder).rbMovieRating.setRating(moviesList.get(position).getVote_average() / 2);
        Glide.with(holder.itemView.getContext())
                .load("https://image.tmdb.org/t/p/w500"
                        + moviesList.get(position).getPoster_path())
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(((MoviesViewHolder) holder).imgMoviePoster);
    }

    @Override
    public int getItemCount() {
        if (moviesList != null)
            return moviesList.size();
        else
            return 0;
    }

    public void setMoviesList(List<MovieModel> moviesList) {
        this.moviesList = moviesList;
        notifyDataSetChanged();
    }

    public MovieModel getSelectedMovie(int position) {
        if (moviesList != null && moviesList.size() > 0) {
            return moviesList.get(position);
        }
        return null;
    }
}
