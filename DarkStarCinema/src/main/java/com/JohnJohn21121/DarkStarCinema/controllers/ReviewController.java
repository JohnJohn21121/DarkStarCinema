package com.JohnJohn21121.DarkStarCinema.controllers;

import com.JohnJohn21121.DarkStarCinema.model.Review;
import com.JohnJohn21121.DarkStarCinema.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/createReview")
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        System.out.println("hi");
        return new ResponseEntity<Review>(reviewService.createReview(payload), HttpStatus.CREATED);
    }
}
