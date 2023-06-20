package com.ziangxue.dineandrateservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;

    private String name;
    private Double rating;
    private Integer ratingCount;

}
