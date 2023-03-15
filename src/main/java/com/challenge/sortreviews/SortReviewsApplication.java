package com.challenge.sortreviews;

import com.challenge.sortreviews.model.Review;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class SortReviewsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SortReviewsApplication.class, args);
    }

    @Override
    public void run(String[] args) throws IOException {
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read JSON file and convert to a customer object
        File jsonFile = new File("src/main/resources/json/reviews.json");
        Review[] reviews = objectMapper.readValue(jsonFile, Review[].class);

        System.out.println(reviews[0]);
    }
}
