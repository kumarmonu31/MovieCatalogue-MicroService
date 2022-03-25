package com.microserice.demo.moviecatalogservice.resources;

import com.microserice.demo.moviecatalogservice.config.RestTemplateConfig;
import com.microserice.demo.moviecatalogservice.model.CatalogItems;
import com.microserice.demo.moviecatalogservice.model.Movie;
import com.microserice.demo.moviecatalogservice.model.UserCatalogItems;
import com.microserice.demo.moviecatalogservice.model.UserRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/catalog") // whenever anyone calls this "/catalog" this will load the the MovieCatalogServices class
public class MovieCatalogServices {
    @Autowired
    private RestTemplate restTemplate;  //this will stablish Rest connection once and retun object once.


    @RequestMapping("/{userId}") //{} tell this will be variable and can we captured
    public UserCatalogItems getCatalog(@PathVariable("userId") String userId) {

        //ratingIfo connect to given url and return UserRating object(means List)
        UserRatings ratings = restTemplate.getForObject("http://movie-rating-Service/ratinginfo/" + userId, UserRatings.class);
        UserCatalogItems userCatalogItems = new UserCatalogItems();
        //itrating over above return list and getting information as requied.
        List<CatalogItems> catalogItems = ratings.getRatings().stream().map(rating -> {
                    Movie movie = restTemplate.getForObject("http://movie-info-service/movie/" + rating.getmovieName(), Movie.class);
                    return new CatalogItems(rating.getmovieName(), movie.getmovieDesc(), rating.getRating());
                })
                .collect(Collectors.toList());
        userCatalogItems.setCatalogItems(catalogItems);
        return userCatalogItems;
        //give userId to Rating Info-->get movieId and rating ->pass movieId to movie info class->get movie details.
    }
}
