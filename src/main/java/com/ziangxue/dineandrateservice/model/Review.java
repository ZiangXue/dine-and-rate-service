package com.ziangxue.dineandrateservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Review {
    
    @Id
    private Long reviewId;

    private Long itemId;
    private Integer rating;
    private String content;
    private Long personId;
    private String added;
}
