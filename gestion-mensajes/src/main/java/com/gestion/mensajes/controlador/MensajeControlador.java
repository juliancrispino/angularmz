package com.gestion.mensajes.controlador;

import com.gestion.mensajes.modelo.MensajeModelo;
import com.gestion.mensajes.servicio.MensajeDAOImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class MensajeControlador {

  @Autowired
  private MensajeDAOImp mensajeDAOImp;   //Llamo al repositorio como una variable llamada "repositorio"

  //este metodo sirve para listar todos los mensajes
  @GetMapping("/mensajes")
  public List<MensajeModelo> listarTodosLosMensajes(){
    return this.mensajeDAOImp.listarTodosLosMensajes();
  }

  //Para guardar mensaje
  @PostMapping("/mensajes")
  public MensajeModelo guardarMensaje(@RequestBody MensajeModelo mensaje){
    return mensajeDAOImp.guardarMensaje(mensaje);
  }




}
