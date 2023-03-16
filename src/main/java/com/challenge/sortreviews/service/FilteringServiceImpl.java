package com.challenge.sortreviews.service;

import com.challenge.sortreviews.Data.DataHolder;
import com.challenge.sortreviews.model.Review;
import com.challenge.sortreviews.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FilteringServiceImpl implements FilteringService{

    private final ReviewRepository reviewRepository;

    public FilteringServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> prioritizeByText(List<Review> reviewList) {
        return reviewList.stream().sorted(Comparator.nullsLast((Comparator<Review>) (o1, o2) -> {
            if(o1.getReviewText().isEmpty() && o2.getReviewText().isEmpty()) {
                return 0;
            }else if(!o1.getReviewText().isEmpty() && !o2.getReviewText().isEmpty()){
                return 0;
            }else if(o1.getReviewText().isEmpty() && !o2.getReviewText().isEmpty()){
                return -1;
            }else{
                return 1;
            }
        }).reversed()).collect(Collectors.toList());

        /*
        List<Review> textReviews = reviewList.stream().filter(r->!r.getReviewText().isEmpty()).collect(Collectors.toList());
        textReviews.addAll(listAllReviews().stream().filter(r->r.getReviewText().isEmpty()).collect(Collectors.toList()));
        return textReviews;
        */

        //The commented code below would set all 5 star reviews first, then all 4 star reviews and so on
        /*
            return reviewList.stream().sorted(Comparator.comparing(Review::getReviewText).reversed()).collect(Collectors.toList());
         */
    }

    @Override
    public List<Review> filterByRating(List<Review> reviewList, boolean low) {
        if(low) {
            return reviewList.stream().sorted(Comparator.comparingInt(Review::getRating)).collect(Collectors.toList());
        }else{
            return reviewList.stream().sorted(Comparator.comparingInt(Review::getRating).reversed()).collect(Collectors.toList());
        }
    }

    @Override
    public List<Review> filterMinRating(List<Review> reviewList, int rating) {
        return reviewList.stream().filter(r->r.getRating()>=rating).collect(Collectors.toList());
    }

    @Override
    public List<Review> orderByDate(List<Review> reviewList, boolean old) {
        if(old) {
            return reviewList.stream().sorted(Comparator.comparing(Review::getReviewCreatedOnDate)).collect(Collectors.toList());
        }else{
            return reviewList.stream().sorted(Comparator.comparing(Review::getReviewCreatedOnDate).reversed()).collect(Collectors.toList());
        }
    }

    @Override
    public List<Review> listAllReviews() {
        return reviewRepository.findAllReviews();
    }
}
