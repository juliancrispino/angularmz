export class Mensaje {
  nombre:string;
  email:string;
  mensaje:string;

  toString(){
    return this.nombre + ' - ' + this.email + ' - ' + this.mensaje;
  }


  constructor(nombre: string, email: string, mensaje: string) {
    this.nombre = nombre;
    this.email = email;
    this.mensaje = mensaje;
  }
}
