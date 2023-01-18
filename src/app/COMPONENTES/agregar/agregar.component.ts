import { Tarea, TareaService } from './../../SERVICE/tarea.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit{

  tareaNueva: Tarea = {id:'', tarea:'', finalizado:false};
  constructor(private tareaService: TareaService, private router:Router){

  }
  ngOnInit(): void {

  }

  agregarTarea(){
    this.tareaService.saveTarea(this.tareaNueva).subscribe({
      next: resp => {
            console.log(resp)
            this.router.navigate(['/inicio']);
      },

      error: err=>{
        console.log(err.error.msg)
      }
    });
  }
}
