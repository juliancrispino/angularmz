package com.gestion.mensajes.controlador;

import com.gestion.mensajes.modelo.MensajeModelo;
import com.gestion.mensajes.servicio.MensajeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

  @GetMapping(path = "/mensajes/{id}")
  public Optional<MensajeModelo> obtenerPorId(@PathVariable("id") Long id){     //Optional porque puede no estar el id
    return this.mensajeServiceImp.obtenerPorId(id);             //El @PathVariable es el parametro que pongo en postman
  }

  @DeleteMapping(path = "/mensajes/{id}")
  public String eliminarMensaje(@PathVariable("id") Long id){
    if (this.mensajeServiceImp.eliminarMensaje(id)){
      return "Mensaje con id " + id + " eliminado";
    } else {
      return "No se encontró mensaje con el id " + id;
    }
  }



}
