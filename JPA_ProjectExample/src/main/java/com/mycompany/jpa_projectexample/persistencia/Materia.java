package com.mycompany.jpa_projectexample.persistencia;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.*;

@Entity
public class Materia implements Serializable {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "tipo", nullable = false)
    private String tipo;
    
    @ManyToOne
    private Carrera carrera;
    
    // Constructor
    public Materia() {
    }
    
    public Materia(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    // Get y Set
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    //
    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    

}
