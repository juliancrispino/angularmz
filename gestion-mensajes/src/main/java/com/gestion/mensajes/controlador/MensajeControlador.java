package com.gestion.mensajes.controlador;

import com.gestion.mensajes.modelo.Mensaje;
import com.gestion.mensajes.repositorio.MensajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class MensajeControlador {

  @Autowired
  private MensajeRepositorio repositorio;

  //este metodo sirve para listar todos los mensajes
  @GetMapping("/mensajes")
  public List<Mensaje> listarTodosLosMensajes(){
    return repositorio.findAll();
  }

  //Para guardar mensaje
  @PostMapping("/mensajes")
  public Mensaje guardarMensaje(@RequestBody Mensaje mensaje){
    return repositorio.save(mensaje);
  }




}
