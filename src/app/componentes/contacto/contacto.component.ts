import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import Swal from 'sweetalert2'

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


  constructor() {

  }


  ngOnInit(): void {
  }

  enviarFormulario(formContacto: any) {
    console.log(this.modelo);
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
