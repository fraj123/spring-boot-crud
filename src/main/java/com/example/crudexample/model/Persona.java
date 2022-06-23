package com.example.crudexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "persona")
public class Persona {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String nombre;
  private String apellido;
  private String correo;

  public Persona (Long id, String nombre, String apellido, String correo) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
  }

  public long getId() {
      return id;
  }

  public void setId(long id) {
      this.id = id;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public String getCorreo() {
      return correo;
  }

  public void setCorreo(String correo) {
      this.correo = correo;
  }

  public String getApellido() {
      return apellido;
  }

  public void setApellido(String apellido) {
      this.apellido = apellido;
  }

}

