import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Mensaje} from "./componentes/contacto/mensaje";

@Injectable({
  providedIn: 'root'      //Para que este disponible en toda la aplicacion
})
export class MensajeService {

  //URL que obtiene el listado de mensajes
  private baseURL = "http://localhost:8080/api/v1/mensajes";

  constructor( private httpClient: HttpClient) { }


  //Nos permite obtener los mensajes
  obtenerListaDeEmpleados():Observable<Mensaje[]>{
    return this.httpClient.get<Mensaje[]>(`${this.baseURL}`)
  }


  //Metodo para registrar un mensaje
  registrarMensaje(mensaje:Mensaje) : Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, mensaje);
  }

}
