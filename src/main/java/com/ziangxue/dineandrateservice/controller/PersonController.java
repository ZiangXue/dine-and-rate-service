package com.ziangxue.dineandrateservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ziangxue.dineandrateservice.model.Person;
import com.ziangxue.dineandrateservice.service.PersonService;


@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/showPersons")
    public Object findPerson(Model model) {

        List<Person> persons = personService.findAll();
        return persons;
    }
}