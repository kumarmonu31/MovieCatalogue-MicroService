package com.microserice.ratingdataservice.model;

import java.util.List;

public class UserRatings {
    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    private List<Rating>ratings;

}
