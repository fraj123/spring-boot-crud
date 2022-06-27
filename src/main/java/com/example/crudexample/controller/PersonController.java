package com.example.crudexample.controller;

import java.util.List;

import com.example.crudexample.model.Person;
import com.example.crudexample.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class PersonController {

  @Autowired
  private PersonRepository personRepository;

  @GetMapping(path = "/persons")
  public List<Person> getAlPersons(){
    return personRepository.findAll();
  }

  @PostMapping(path = "/persons")
  public Person createPerson(@RequestBody Person person) {
    return personRepository.save(person);
  }


}
