package com.example.demo.Service;

import com.example.demo.model.Tarea;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TareaService {

    public List<Tarea> findAll();

    public Tarea save(Tarea tara);

    public Tarea findById(Integer id);

    public void delete(Integer id);

}
