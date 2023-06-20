package com.ziangxue.dineandrateservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ziangxue.dineandrateservice.model.Menu;
import com.ziangxue.dineandrateservice.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuRepository repository;

    @Override
    public void addMenu(Menu menu) {
        repository.save(menu);
    }

    @Override
    public List<Menu> getMenuByDiningHallIdAndDate(Long diningHallId, String date) {
        return repository.findMenusByDiningHallIdAndDate(diningHallId, date);
    }

    // @Override
    // public List<Menu> getMenuByDiningHallIdAndDateAndMeal(Long diningHallId, String date, String meal) {
    //     return repository.findMenusByDiningHallIdAndDateAndMeal(diningHallId, date, meal);
    // }

    @Override
    public void addMenus(List<Menu> menus) {
        repository.saveAll(menus);
    }
    
}
