package com.gestion.mensajes.servicio;

import com.gestion.mensajes.modelo.MensajeModelo;

import java.util.List;
import java.util.Optional;

public interface MensajeService {

  List<MensajeModelo> listarTodosLosMensajes();
  MensajeModelo guardarMensaje(MensajeModelo mensajeModelo);
  Optional<MensajeModelo> obtenerPorId(Long id);
  boolean eliminarMensaje(Long id);


}
