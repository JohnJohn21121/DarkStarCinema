package com.JohnJohn21121.DarkStarCinema.repository;

import com.JohnJohn21121.DarkStarCinema.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {


}
