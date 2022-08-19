package com.gestion.mensajes.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MensajeDTO {

  private Long id;
  private String nombre;
  private String email;
  private String mensaje;

}
