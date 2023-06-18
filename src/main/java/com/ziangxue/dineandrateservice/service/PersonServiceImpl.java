package com.ziangxue.dineandrateservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ziangxue.dineandrateservice.model.Person;
import com.ziangxue.dineandrateservice.repository.PersonRepository;



@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository repository;

    @Override
    public List<Person> findAll() {
        return (List<Person>) repository.findAll();
    }
    
}
