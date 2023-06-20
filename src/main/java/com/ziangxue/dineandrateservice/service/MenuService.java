package com.ziangxue.dineandrateservice.service;

import java.util.List;

import com.ziangxue.dineandrateservice.model.Menu;

public interface MenuService {
    void addMenu(Menu menu);

    List<Menu> getMenuByDiningHallIdAndDate(Long diningHallId, String date);

    // List<Menu> getMenuByDiningHallIdAndDateAndMeal(Long diningHallId, String date, String meal);

    void addMenus(List<Menu> menus);
}
