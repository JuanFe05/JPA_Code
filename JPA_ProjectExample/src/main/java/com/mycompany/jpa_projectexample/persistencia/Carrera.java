package com.mycompany.jpa_projectexample.persistencia;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.*;

@Entity
public class Carrera implements Serializable {
    
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @OneToMany(mappedBy = "carrera")
    private LinkedList<Materia> listaMaterias;
    
    // Constructor
    public Carrera() {
    }

    public Carrera(int id, String nombre, LinkedList<Materia> listaMaterias) {
        this.id = id;
        this.nombre = nombre;
        this.listaMaterias = listaMaterias;
    }
    
    //Get y Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(LinkedList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
    

    // toString
    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", nombre=" + nombre + ", listaMaterias=" + listaMaterias + '}';
    }
    
       
}
