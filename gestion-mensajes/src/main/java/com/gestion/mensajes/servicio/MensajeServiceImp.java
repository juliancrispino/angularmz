package com.gestion.mensajes.servicio;

import com.gestion.mensajes.modelo.MensajeModelo;
import com.gestion.mensajes.repositorio.MensajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MensajeServiceImp implements MensajeService{

  @Autowired
  private MensajeRepositorio mensajeRepositorio;


  @Override
  public List<MensajeModelo> listarTodosLosMensajes() {
    return mensajeRepositorio.findAll();
  } //Utilizo las fx del repositorio

  @Override
  public MensajeModelo guardarMensaje(MensajeModelo mensajeModelo) {
    return mensajeRepositorio.save(mensajeModelo);
  } //Utilizo otra funcion del repositorio

}
