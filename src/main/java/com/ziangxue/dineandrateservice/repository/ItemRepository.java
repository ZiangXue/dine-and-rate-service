package com.ziangxue.dineandrateservice.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ziangxue.dineandrateservice.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long>{
}
