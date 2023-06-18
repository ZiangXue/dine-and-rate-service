package com.ziangxue.dineandrateservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.ziangxue.dineandrateservice.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
    
}
