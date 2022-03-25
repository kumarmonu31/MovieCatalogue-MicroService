package com.microserice.ratingdataservice.model;

public class Rating {

    private String movieName;
    private  int rating;

    public String getmovieName() {
        return movieName;
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
