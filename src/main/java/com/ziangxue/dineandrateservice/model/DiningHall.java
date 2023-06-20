package com.ziangxue.dineandrateservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DiningHall {
    
    @Id
    private Integer diningHallId;
    
    private String name;
    private String campus;
}
