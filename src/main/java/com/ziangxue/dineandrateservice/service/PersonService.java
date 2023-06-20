package com.ziangxue.dineandrateservice.service;

import java.util.List;
import java.util.Optional;

import com.ziangxue.dineandrateservice.model.Person;

public interface PersonService {

    List<Person> findAll();

    Optional<Person> findPerson(Long id);

    void addPerson(Person person);
}
