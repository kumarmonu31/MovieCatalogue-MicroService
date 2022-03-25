package com.microserice.demo.movieinfoservice.resource;

import com.microserice.demo.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId){
       return new Movie(movieId,movieId+" nice movie");
    }
}
