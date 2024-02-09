package com.JohnJohn21121.DarkStarCinema.service;

import com.JohnJohn21121.DarkStarCinema.model.Movie;
import com.JohnJohn21121.DarkStarCinema.model.Review;
import com.JohnJohn21121.DarkStarCinema.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(Map<String, String> payload) {

        Review review = reviewRepository.insert(new Review(payload.get("reviewBody")));

        reviewRepository.insert(review);
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(payload.get("imdbId")))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }
}
