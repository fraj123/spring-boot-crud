package com.example.crudexample.repository;

import com.example.crudexample.model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
  
}
