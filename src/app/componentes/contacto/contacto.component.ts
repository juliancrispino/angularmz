import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import Swal from 'sweetalert2'
import {MensajeService} from "../../mensaje.service";
import {Router} from "@angular/router";

interface formContacto{
  "nombre":string;
  "email": string;
  "mensaje": string;
}

@Component({
  selector: 'app-contacto',
  templateUrl: './contacto.component.html',
  styleUrls: ['./contacto.component.css']
})
export class ContactoComponent implements OnInit {

  modelo = {                 //Modelo inicial. Gracias a la two way binding, aca puedo poner un dato x defecto.
    nombre: "",
    email: "",
    mensaje: ""
  }


  constructor( private mensajeServicio:MensajeService, private router:Router) {

  }


  ngOnInit(): void {
  }

  guardarMensaje(){
    this.mensajeServicio.registrarMensaje(this.modelo).subscribe(dato => {
      console.log(dato)

    }, error => console.log(error));
  }


  enviarFormulario(formContacto: any) {
    console.log(this.modelo);
    this.guardarMensaje();
    formContacto.form.reset();

  }

  avisoOk() {
    Swal.fire(
      'Formulario enviado!',
      'Su mensaje ha sido enviado',
      'success'
    )
  }
}
