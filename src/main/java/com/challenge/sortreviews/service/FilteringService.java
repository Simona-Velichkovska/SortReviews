package com.challenge.sortreviews.service;

import com.challenge.sortreviews.model.Review;

import java.util.List;

public interface FilteringService {
    public List<Review> prioritizeByText(List<Review> reviewList);
    public List<Review> filterByRating(List<Review> reviewList);
    public List<Review> filterMinRating(List<Review> reviewList);
    public List<Review> orderByDate(List<Review> reviewList);

    public List<Review> listAllReviews();

}
