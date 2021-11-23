import {Injectable } from "@angular/core";
import {HttpClient} from "@angular/common/http";
import { Observable } from "rxjs";
import cepDto from "../dto/cepDto";

// @Injectable({
//     providedIn: 'root'
// })



// export class BuscarCepService{


//     constructor(
//         private http: HttpClient
//     ) {}



//     buscarCep(cep: string): Observable<cepDto> {


//         const endpoint = "";

//         return this.http.get<cepDto>(endpoint).pipe(
//             tap(form => this.log())


//     }
// }