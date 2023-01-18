package com.example.demo.Controller;


import com.example.demo.Service.TareaService;
import com.example.demo.model.Tarea;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class TareaController {


    private TareaService tareaService;

    public TareaController(TareaService tareaService){
        this.tareaService = tareaService;
    }

    //Lista
    @GetMapping("/tareas")
    public List<Tarea> listar() {
        return tareaService.findAll();
    }


    //Guardar

    @PostMapping("/tareas")
    public Tarea guardar(@RequestBody Tarea tarea) {
        return tareaService.save(tarea);
    }

    //Buscar una tarea
    @GetMapping("/tareas/{id}")
    public Tarea getUnaTarea(@PathVariable Integer id){
        return tareaService.findById(id);
    }

    //Modificar
    @PutMapping("/tareas/{id}")
    public Tarea modificar(@RequestBody Tarea tarea, @PathVariable Integer id){
        Tarea tareaActual = tareaService.findById(id);
        tareaActual.setTarea(tarea.getTarea());
        tareaActual.setFinalizado(tarea.getFinalizado());

        return tareaService.save(tareaActual);
    }


    @DeleteMapping("/tareas/{id}")
    public void eliminar(@PathVariable Integer id){
        tareaService.delete(id);
    }


}


