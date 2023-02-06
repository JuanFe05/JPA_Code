package com.mycompany.jpa_projectexample.logica;

import com.mycompany.jpa_projectexample.persistencia.Alumno;
import com.mycompany.jpa_projectexample.persistencia.Carrera;
import com.mycompany.jpa_projectexample.persistencia.Materia;
import com.mycompany.jpa_projectexample.persistencia.PersistenceController;
import java.util.*;

public class LogicController {
    
    Alumno objAlumno;
    Carrera objCarrera;
    
    PersistenceController persistence = new PersistenceController();
    
    // Lista de materias
    LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
    
    /* ==================== Alumno ==================== */
    // Crear Alumno
    public void crearAlumno(){   
        objAlumno = new Alumno(0, "Ana", "Viáfara", new Date(), objCarrera);
        persistence.crearAlumno(objAlumno);
    }
    
    public void eliminarAlumno(){ 
        int id = 1;
        persistence.eliminarAlumno(id);
    }
    
    // Editar Alumno que recién se ha creado
    public void editarAlumno(){
        objAlumno.setNombres("Juan Felipe");
        persistence.editarAlumno(objAlumno);
    }
    
    public void editarAlumnoCarrera(){
        int idAlumno = 151, idCarrera = 2;
        persistence.editarAlumnoCarrera(idAlumno, idCarrera);
    }
    
    public Alumno buscarAlumno(int id){
        return persistence.buscarAlumno(id);
    }
    
    public void buscarAlumnos(){
        List<Alumno> listaAlumnos = persistence.buscarAlmnos();
        
        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno);
        }
    }
    
    /* ==================== Carrera ==================== */
    public void crearCarrera(){   
        //objCarrera = new Carrera(1, "Psicología");
        persistence.crearCarrera(objCarrera);
    }
    
    public void eliminarCarrera(){ 
        int id = 4;
        persistence.eliminarCarrera(id);
    }
    
    /* ==================== Materia ==================== */
    public void crearMateria(){
        Materia objMateria1 = new Materia(2, "Calculo Diferencial", "Matemáticas");
        Materia objMateria2 = new Materia(3, "Estadística 1", "Economía");
        
        persistence.crearMateria(objMateria1);
        persistence.crearMateria(objMateria2);
        
        listaMaterias.add(objMateria1);
        listaMaterias.add(objMateria2);
    }
    
    public void eliminarMateria(){ 
        int id = 1;
        persistence.eliminarCarrera(id);
    }
    
    public void buscarMaterias(){
        List<Materia> lista = persistence.buscarMaterias();
        LinkedList<Materia> listaMaterias = new LinkedList(lista);
        
        for (Materia materias : listaMaterias) {
            System.out.println(materias);
        }
    }
    
    public void addMateriasToCarrera(){
        int idCarrera = 1;
        List<Integer> idsMaterias = Arrays.asList(1, 3, 4);
        persistence.addMateriaCarrera(idCarrera, idsMaterias);
    }
    
}
