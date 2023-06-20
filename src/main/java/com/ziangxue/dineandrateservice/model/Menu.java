package com.ziangxue.dineandrateservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    private Long menuId;

    private Long diningHallId;
    private Long itemId;
    private String date;
    private String meal;
    private String station;
    
}
