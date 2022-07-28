package com.gestion.mensajes.modelo;

import javax.persistence.*;

@Entity
@Table(name = "mensajes")
public class Mensaje {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nombre", length = 60, nullable = false)
  private String nombre;

  @Column(name = "email", length = 60, nullable = false)
  private String email;

  @Column(name = "mensaje", length = 225, nullable = false)
  private String mensaje;


  //Contructor
  public Mensaje() {
  }

  //Getters and setters

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getmensaje() {
    return mensaje;
  }

  public void setmensaje(String mensaje) {
    this.mensaje = mensaje;
  }
}
