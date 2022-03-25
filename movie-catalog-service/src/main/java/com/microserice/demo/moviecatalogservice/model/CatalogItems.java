package com.microserice.demo.moviecatalogservice.model;

public class CatalogItems {
    private String movieName;
    private  String movieDsc;

    public String getMovieName() {
        return movieName;
    }

    public CatalogItems(String movieName, String movieDsc, int movieRating) {
        this.movieName = movieName;
        this.movieDsc = movieDsc;
        this.movieRating = movieRating;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDsc() {
        return movieDsc;
    }

    public void setMovieDsc(String movieDsc) {
        this.movieDsc = movieDsc;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    private  int movieRating;

}
