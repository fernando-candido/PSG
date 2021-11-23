import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-mensagem',
  templateUrl: './mensagem.component.html',
  styleUrls: ['./mensagem.component.css']
})
export class MensagemComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }


  @Input()
   nome: string = "";

  @Input()
  sobreNome: string ="";

  @Input()
  cep: any = "";




}
