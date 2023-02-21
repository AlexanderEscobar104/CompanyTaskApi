package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "people")
public class People {
    private int id;
    private String nombres;



    public People() {
    }

    public People(int id, String nombres) {
        this.id = id;
        this.nombres = nombres;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
