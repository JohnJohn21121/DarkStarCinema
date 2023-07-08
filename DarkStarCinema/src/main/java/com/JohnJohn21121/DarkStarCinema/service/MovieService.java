package com.JohnJohn21121.DarkStarCinema.service;

import com.JohnJohn21121.DarkStarCinema.model.Movie;
import com.JohnJohn21121.DarkStarCinema.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

}
