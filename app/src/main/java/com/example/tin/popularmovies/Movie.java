package com.example.tin.popularmovies;



/** Constructor Class Containing Getters */
class Movie {

    private final String posterImageUrl;
    private final String movieTitle;
    private final String movieSynopsis;
    private final String movieUserRating;
    private final String movieReleaseDate;

    private final String BASE_IMAGE_URL = "http://image.tmdb.org/t/p/w342/";

    // The Constructor
    public Movie(String posterImageUrl, String movieTitle, String movieSynopsis,
                 String movieUserRating, String movieReleaseDate) {

        this.posterImageUrl = posterImageUrl;
        this.movieTitle = movieTitle;
        this.movieSynopsis = movieSynopsis;
        this.movieUserRating = movieUserRating;
        this.movieReleaseDate = movieReleaseDate;

    }

    // The Getters
    public String getPosterImageUrl() {
        return BASE_IMAGE_URL + posterImageUrl;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieSynopsis() {
        return movieSynopsis;
    }

    public String getMovieUserRating() {
        return movieUserRating;
    }

    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }

}
