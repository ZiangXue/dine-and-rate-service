package com.ziangxue.dineandrateservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ziangxue.dineandrateservice.model.Menu;

public interface MenuRepository extends CrudRepository<Menu, Long>{

    @Query("SELECT m FROM Menu m WHERE m.diningHallId = :diningHallId and m.date = :date")
    List<Menu> findMenusByDiningHallIdAndDate(@Param("diningHallId") Long diningHallId, @Param("date") String date);

    @Query("SELECT m FROM Menu m WHERE m.diningHallId = :diningHallId and m.date = :date and m.meal = :meal")
    List<Menu> findMenusByDiningHallIdAndDateAndMeal(@Param("diningHallId") Long diningHallId, @Param("date") String date, @Param("meal") String meal);

}
