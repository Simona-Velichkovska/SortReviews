package com.challenge.sortreviews.Data;

import com.challenge.sortreviews.model.Review;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataHolder {

    public List<Review> reviewList = new ArrayList<>();

    @PostConstruct
    public void init() throws IOException {
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read JSON file and convert to a review object
        File jsonFile = new File("src/main/resources/json/reviews.json");
        Review[] reviews = objectMapper.readValue(jsonFile, Review[].class);
        reviewList.addAll(Arrays.asList(reviews));

    }
}
