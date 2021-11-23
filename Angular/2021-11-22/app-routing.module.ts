import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AbrirProcessoComponent } from './abrir-processo/abrir-processo.component';

const routes: Routes = [
   { path: '', component: AbrirProcessoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
