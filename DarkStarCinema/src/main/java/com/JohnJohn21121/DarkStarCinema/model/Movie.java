package com.JohnJohn21121.DarkStarCinema.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
import java.util.UUID;

@Document(collection = "movies")
@Data
@AllArgsConstructor
public class Movie {

    @Id
    private String id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    //Manual Reference relationship
    @DocumentReference
    private List<Review> reviewIds;

    public Movie() {
        this.id = UUID.randomUUID().toString();
    }
}
