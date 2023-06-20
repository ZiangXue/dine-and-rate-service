package com.ziangxue.dineandrateservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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

    @Override
    public Optional<Person> findPerson(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void addPerson(Person person) {
        // Person newPerson = new Person(personId, name, campus, email, username);
        repository.save(person);
    }
    
}
