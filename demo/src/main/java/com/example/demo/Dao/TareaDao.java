package com.example.demo.Dao;

import com.example.demo.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface TareaDao extends CrudRepository<Tarea, Integer> {
}
