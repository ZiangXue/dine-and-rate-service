package com.ziangxue.dineandrateservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.ziangxue.dineandrateservice.model.Review;
import java.util.List;


public interface ReviewRepository extends CrudRepository<Review, Long>{
    List<Review> findByItemId(Long itemId);
}
