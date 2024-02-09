package com.JohnJohn21121.DarkStarCinema.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    private String id;
    private String Body;

    public Review(String body) {
        this.id = UUID.randomUUID().toString();
        Body = body;
    }
}
