package com.mycompany.jpa_projectexample.persistencia;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Alumno implements Serializable {
    
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "nombres", nullable = false)
    private String nombres;
    
    @Column(name = "apellidos", nullable = false)
    private String apellidos;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    
    @OneToOne
    private Carrera carrera;
    
    //Constructor
    public Alumno() {
    }

    public Alumno(int id, String nombres, String apellidos, Date fechaNacimiento, Carrera carrera) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
    }

    //Get y Set
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    

    // toString
    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
}
