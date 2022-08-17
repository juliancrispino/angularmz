package com.gestion.mensajes.servicio;

import com.gestion.mensajes.modelo.MensajeModelo;

import java.util.List;

public interface MensajeDAO {

  List<MensajeModelo> listarTodosLosMensajes();

  MensajeModelo guardarMensaje(MensajeModelo mensajeModelo);

}
