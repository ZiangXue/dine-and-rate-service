package com.ziangxue.dineandrateservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ziangxue.dineandrateservice.model.Item;
import com.ziangxue.dineandrateservice.model.Review;
import com.ziangxue.dineandrateservice.repository.ItemRepository;
import com.ziangxue.dineandrateservice.repository.ReviewRepository;

public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public void addReview(Review review) {
        reviewRepository.save(review);
    }

    @Override
    public List<Review> findReviewsByItemId(Long itemId) {
        return reviewRepository.findByItemId(itemId);
    }

    @Override
    public Double findRatingByItemId(Long itemId) {
        Item item = itemRepository.findById(itemId).get();
        return item.getRating();
    }
    
}
