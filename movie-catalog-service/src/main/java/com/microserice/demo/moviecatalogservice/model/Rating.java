package com.microserice.demo.moviecatalogservice.model;

public class Rating {
    public String getmovieName() {
        return movieName;
    }

    private String movieName;
    private  int rating;

    public Rating() {
    }

    public Rating(String movieName, int rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    public void setmovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


}
