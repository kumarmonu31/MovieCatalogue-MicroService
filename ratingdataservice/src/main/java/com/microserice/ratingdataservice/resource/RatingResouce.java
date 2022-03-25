package com.microserice.ratingdataservice.resource;


import com.microserice.ratingdataservice.model.Rating;
import com.microserice.ratingdataservice.model.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratinginfo")
public class RatingResouce {
    @RequestMapping("/{userId}")
    public UserRatings getRatings(@PathVariable("userId") String movieId){
        List<Rating>result= Arrays.asList(
                new Rating("Spider Man",4),
                new Rating("Iron man",3),
                new Rating("Don",5)
        );
        UserRatings userRatings=new UserRatings();
        userRatings.setRatings(result);
        return userRatings;
    }
}
