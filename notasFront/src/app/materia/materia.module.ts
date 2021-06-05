import { MateriaService } from './materia.service';
import { MateriaListaComponent } from './materia-lista/materia-lista.component';
import { ReactiveFormsModule, FormGroup, FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule, Location } from '@angular/common';

import { MateriaRoutingModule } from './materia-routing.module';
import { MateriaDetalheComponent } from './materia-detalhe/materia-detalhe.component';
import { MateriaFaltasComponent } from './materia-faltas/materia-faltas.component';


@NgModule({
  declarations: [MateriaListaComponent, MateriaDetalheComponent, MateriaFaltasComponent],

  imports: [
    CommonModule,
    MateriaRoutingModule,
    ReactiveFormsModule

  ]
})
export class MateriaModule { }
