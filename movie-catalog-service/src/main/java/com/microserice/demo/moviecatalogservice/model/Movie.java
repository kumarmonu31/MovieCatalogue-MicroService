package com.microserice.demo.moviecatalogservice.model;

public class Movie {
    private String movieId;
    private String movieDesc;

    public Movie(String movieId, String movieDesc) {
        this.movieId = movieId;
        this.movieDesc = movieDesc;
    }

    public Movie() {
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getmovieDesc() {
        return movieDesc;
    }

    public void setmovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    

}
