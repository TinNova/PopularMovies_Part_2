package com.example.tin.popularmovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {


    private ImageView mMoviePoster;
    private TextView mMovieTitle;
    private TextView mMovieSynopsis;
    private TextView mMovieUserRating;
    private TextView mMovieReleaseDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mMoviePoster = (ImageView) findViewById(R.id.movie_image);
        mMovieTitle = (TextView) findViewById(R.id.movie_title);
        mMovieSynopsis = (TextView) findViewById(R.id.movie_synopsis);
        mMovieUserRating = (TextView) findViewById(R.id.movie_rating);
        mMovieReleaseDate = (TextView) findViewById(R.id.movie_release_date);

        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity.hasExtra("MovieTitle")) {

            String moviePoster = intentThatStartedThisActivity.getStringExtra("MoviePoster");
            String movieTitle = intentThatStartedThisActivity.getStringExtra("MovieTitle");
            String movieSynopsis = intentThatStartedThisActivity.getStringExtra("MovieSynopsis");
            String movieUserRating = intentThatStartedThisActivity.getStringExtra("MovieUserRating");
            String movieReleaseDate = intentThatStartedThisActivity.getStringExtra("MovieReleaseDate");

            Picasso.with(this).load(moviePoster).into(mMoviePoster);
            mMovieTitle.setText(movieTitle);
            mMovieSynopsis.setText(movieSynopsis);
            mMovieUserRating.setText(movieUserRating);
            mMovieReleaseDate.setText(movieReleaseDate);

        }
    }
}
