import { Component, OnInit } from '@angular/core';
import {Mensaje} from "../contacto/mensaje";
import {MensajeService} from "../../mensaje.service";


@Component({
  selector: 'app-lista-mensajes',
  templateUrl: './lista-mensajes.component.html',
  styleUrls: ['./lista-mensajes.component.css']
})
export class ListaMensajesComponent implements OnInit {

  mensajes:Mensaje[];

  constructor( private mensajeServicio:MensajeService) { }

  ngOnInit(): void {
    this.obtenerMensajes();
  }

  private obtenerMensajes(){
    this.mensajeServicio.obtenerListaDeMensajes().subscribe(dato =>{
      this.mensajes = dato;
    });
  }

}
