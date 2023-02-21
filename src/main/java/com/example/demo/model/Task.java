package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    private int id;
    private String tarea;
    private String estado;
    private String asignado;
    private String fechaejecucion;
    private String horaejecucion;
    private String fechacreacion;


    public Task() {
    }

    public Task(int id, String tarea, String estado, String asignado, String fechaejecucion, String horaejecucion, String fechacreacion) {
        this.id = id;
        this.tarea = tarea;
        this.estado = estado;
        this.asignado = asignado;
        this.fechaejecucion = fechaejecucion;
        this.horaejecucion = horaejecucion;
        this.fechacreacion = fechacreacion;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAsignado() {
        return asignado;
    }

    public void setAsignado(String asignado) {
        this.asignado = asignado;
    }

    public String getFechaejecucion() {
        return fechaejecucion;
    }

    public void setFechaejecucion(String fechaejecucion) {
        this.fechaejecucion = fechaejecucion;
    }

    public String getHoraejecucion() {
        return horaejecucion;
    }

    public void setHoraejecucion(String horaejecucion) {
        this.horaejecucion = horaejecucion;
    }

    public String getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

}
