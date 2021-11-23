import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-abrir-processo',
  templateUrl: './abrir-processo.component.html',
  styleUrls: ['./abrir-processo.component.css']
})
export class AbrirProcessoComponent implements OnInit {
  public nomeComponentePai: string ="";
  public sobreNomeComponentePai: string="";
  public cepComponentePai: string ="";

  constructor() { }

  ngOnInit(): void {
  }

}
