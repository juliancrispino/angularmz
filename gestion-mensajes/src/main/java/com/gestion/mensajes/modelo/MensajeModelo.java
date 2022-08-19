package com.gestion.mensajes.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mensajes")
public class MensajeModelo implements Serializable {    //Serializable encripta el objeto, lo convierte en bytes

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nombre", length = 60, nullable = false)
  private String nombre;

  @Column(name = "email", length = 60, nullable = false)
  private String email;

  @Column(name = "mensaje", length = 225, nullable = false)
  private String mensaje;


  //Contructores
  public MensajeModelo() {
  }

  public MensajeModelo(Long id, String nombre, String email, String mensaje) {
    this.id = id;
    this.nombre = nombre;
    this.email = email;
    this.mensaje = mensaje;
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
