package com.gestion.mensajes.servicio;

import com.gestion.mensajes.modelo.MensajeModelo;
import com.gestion.mensajes.repositorio.MensajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

  @Override
  public Optional<MensajeModelo> obtenerPorId(Long id) {    //Optional porque puede no estar ese ID
    return mensajeRepositorio.findById(id);
  }

  @Override
  public boolean eliminarMensaje(Long id) {
    try{
      mensajeRepositorio.deleteById(id);
      return true;
    } catch (Exception e){
      return false;
    }
  }


}
