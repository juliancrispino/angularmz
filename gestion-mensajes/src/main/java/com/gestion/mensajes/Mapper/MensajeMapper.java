package com.gestion.mensajes.Mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gestion.mensajes.DTO.MensajeDTO;
import com.gestion.mensajes.modelo.MensajeModelo;

public class MensajeMapper {

//  ObjectMapper om = new ObjectMapper();
//  MensajeModelo mensajeModelo = om.convertValue(MensajeDTO, MensajeModelo.class);
//
//
  private ObjectMapper om;

  public MensajeMapper() {
    om = new ObjectMapper();
  }

  public MensajeDTO mapMensajeModeloToDTO(MensajeModelo mensajeModelo) {
    return om.convertValue(mensajeModelo,MensajeDTO.class);
  }

  public MensajeModelo mapDTOToMensajeModelo(MensajeDTO mensajeDTO) {
    return om.convertValue(mensajeDTO, MensajeModelo.class);
  }

}
