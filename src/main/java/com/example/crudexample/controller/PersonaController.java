package com.example.crudexample.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import com.example.crudexample.model.Persona;
import com.example.crudexample.services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona/")
public class PersonaController {
  
  @Autowired
  private PersonaService personaService;

  @PostMapping
  private ResponseEntity<Persona> save (@RequestBody Persona persona) {
    Persona temporalPersona = personaService.create(persona);

    try {
      return ResponseEntity.created(new URI("/api/persona"+temporalPersona.getId())).body(temporalPersona);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
  }

  @GetMapping
  private ResponseEntity<List<Persona>> getAllPersonas() {
    return ResponseEntity.ok(personaService.getAllPersonas());
  }

  @GetMapping (value = "{id}")
  private ResponseEntity<Optional<Persona>> getPersonaById (@PathParam("id") Long id) {
    return ResponseEntity.ok(personaService.findByIdPersona(id));
  }

  @DeleteMapping
  private ResponseEntity<Void> deletePersona (@RequestBody Persona persona) {
    personaService.delete(persona);
    return ResponseEntity.ok().build();
  }
}
