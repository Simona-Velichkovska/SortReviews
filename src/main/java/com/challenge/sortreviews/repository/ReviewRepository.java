package com.challenge.sortreviews.repository;

import com.challenge.sortreviews.Data.DataHolder;
import com.challenge.sortreviews.model.Review;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReviewRepository {
    public List<Review> findAllReviews(){
        return DataHolder.reviewList;
    }

    public Optional<Review> findById(Long Id){
        return DataHolder.reviewList.stream().filter(r->r.getId().equals(Id)).findFirst();
    }
}
