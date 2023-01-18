package com.example.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name="TB_Tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private Integer Id;

    @Column(name="Tarea")
    private String Tarea;

    @Column(name="Finalizado")
    private Boolean Finalizado;

    public Tarea() {
    }

    public Tarea(Integer id, String tarea, Boolean finalizado) {
        this.Id = id;
        this.Tarea = tarea;
        this.Finalizado = finalizado;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTarea() {
        return Tarea;
    }

    public void setTarea(String tarea) {
        Tarea = tarea;
    }

    public Boolean getFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        Finalizado = finalizado;
    }
}
