import { Component, Input, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import cepDto from '../dto/cepDto';
// import { BuscarCepService } from './buscar-cep.service';

@Component({
  selector: 'app-buscar-cep',
  templateUrl: './buscar-cep.component.html',
  styleUrls: ['./buscar-cep.component.css']
})
export class BuscarCepComponent implements OnInit {

  // constructor(
  //   public service: BuscarCepService
  // ) { }

  ngOnInit(): void {

  }

  dto: cepDto = new cepDto();
  dados:  cepDto = new cepDto();

  @Input() cep: string = "";
 

  // buscarCep(): void{

  //   this.service.buscarCep(this.cep)
  //   .subscribe(dto  => {

  //     this.dados = dto;

  //   });


  // }




}
