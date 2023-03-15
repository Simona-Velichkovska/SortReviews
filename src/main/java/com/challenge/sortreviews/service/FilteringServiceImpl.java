package com.challenge.sortreviews.service;

import com.challenge.sortreviews.model.Review;
import com.challenge.sortreviews.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilteringServiceImpl implements FilteringService{

    private final ReviewRepository reviewRepository;

    public FilteringServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> prioritizeByText(List<Review> reviewList) {
        return null;
    }

    @Override
    public List<Review> filterByRating(List<Review> reviewList) {
        return null;
    }

    @Override
    public List<Review> filterMinRating(List<Review> reviewList) {
        return null;
    }

    @Override
    public List<Review> orderByDate(List<Review> reviewList) {
        return null;
    }

    @Override
    public List<Review> listAllReviews() {
        return reviewRepository.findAllReviews();
    }
}
