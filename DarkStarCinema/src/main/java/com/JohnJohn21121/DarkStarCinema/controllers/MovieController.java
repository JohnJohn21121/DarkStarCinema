package com.JohnJohn21121.DarkStarCinema.controllers;

import com.JohnJohn21121.DarkStarCinema.model.Movie;
import com.JohnJohn21121.DarkStarCinema.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;
    

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String id) {
        return new ResponseEntity<Optional<Movie>>(movieService.getSingleMovie(id), HttpStatus.OK);
    }

}
