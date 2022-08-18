package com.gestion.mensajes.controlador;

import com.gestion.mensajes.modelo.MensajeModelo;
import com.gestion.mensajes.servicio.MensajeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class MensajeControlador {

  @Autowired
  private MensajeServiceImp mensajeServiceImp;   //Llamo al repositorio como una variable llamada "repositorio"

  //este metodo sirve para listar todos los mensajes
  @GetMapping("/mensajes")
  public List<MensajeModelo> listarTodosLosMensajes(){
        return this.mensajeServiceImp.listarTodosLosMensajes();
  }

  //Para guardar mensaje
  @PostMapping("/mensajes")
  public MensajeModelo guardarMensaje(@RequestBody MensajeModelo mensaje){
    return mensajeServiceImp.guardarMensaje(mensaje);
  }




}
