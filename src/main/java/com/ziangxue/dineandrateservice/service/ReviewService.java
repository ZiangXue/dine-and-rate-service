package com.ziangxue.dineandrateservice.service;

import java.util.List;
import java.util.Optional;

import com.ziangxue.dineandrateservice.model.Review;

public interface ReviewService {
    void addReview(Review review);

    List<Review> findReviewsByItemId(Long itemId);
    
    Double findRatingByItemId(Long itemId);
}
