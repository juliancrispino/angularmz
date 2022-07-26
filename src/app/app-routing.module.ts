import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HeroeComponent} from "./componentes/heroe/heroe.component";
import {NosotrosComponent} from "./componentes/nosotros/nosotros.component";
import {PortfolioComponent} from "./componentes/portfolio/portfolio.component";
import {ContactoComponent} from "./componentes/contacto/contacto.component";

const routes: Routes = [
  {path : '', component : HeroeComponent},
  {path : 'home', component : HeroeComponent},
  {path : 'nosotros', component : NosotrosComponent},
  {path : 'portfolio', component : PortfolioComponent},
  {path : 'contacto', component : ContactoComponent},
  {path : '', pathMatch: 'full', redirectTo : 'home'}
];

@NgModule({

  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
