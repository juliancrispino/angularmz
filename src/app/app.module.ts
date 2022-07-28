import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './componentes/navbar/navbar.component';
import { HeroeComponent } from './componentes/heroe/heroe.component';
import { NosotrosComponent } from './componentes/nosotros/nosotros.component';
import { PortfolioComponent } from './componentes/portfolio/portfolio.component';
import { ContactoComponent } from './componentes/contacto/contacto.component';
import { FooterComponent } from './componentes/footer/footer.component';
import {FormsModule} from "@angular/forms";
import { ListaMensajesComponent } from './componentes/lista-mensajes/lista-mensajes.component';
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HeroeComponent,
    NosotrosComponent,
    PortfolioComponent,
    ContactoComponent,
    FooterComponent,
    ListaMensajesComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        HttpClientModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
