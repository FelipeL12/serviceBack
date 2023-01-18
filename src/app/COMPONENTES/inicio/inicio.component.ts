import { TareaService } from './../../SERVICE/tarea.service';
import { Component, OnInit } from '@angular/core';
import { Subscriber } from 'rxjs';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit{

  lista:any=[];
  constructor(private tareaService: TareaService){}
  ngOnInit(): void {
      this.listarTareas();
  }

  listarTareas(){
    this.tareaService.getTareas().subscribe(
      {
        next: resp => {
          this.lista=resp;
          console.log(resp)
        },

        error: err=>{
          console.log(err.error.msg)
        }
      });
  }

}
