package com.JohnJohn21121.DarkStarCinema.repository;

import com.JohnJohn21121.DarkStarCinema.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {


}
