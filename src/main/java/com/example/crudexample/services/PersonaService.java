package com.example.crudexample.services;

import java.util.List;
import java.util.Optional;

import com.example.crudexample.model.Persona;
import com.example.crudexample.repository.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

  @Autowired
  private PersonaRepository personaRepository;

  public Persona create(Persona persona) {
    return personaRepository.save(persona);
  }

  public Optional<Persona> findByIdPersona(Long id){
    return personaRepository.findById(id);
  }

  public List<Persona> getAllPersonas() {
    return personaRepository.findAll();
  }

  public void delete(Persona persona) {
    personaRepository.delete(persona);
  }
}
