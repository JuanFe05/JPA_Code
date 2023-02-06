package com.mycompany.jpa_projectexample.persistencia;

import com.mycompany.jpa_projectexample.dao.AlumnoJpaController;
import com.mycompany.jpa_projectexample.dao.CarreraJpaController;
import com.mycompany.jpa_projectexample.dao.MateriaJpaController;
import com.mycompany.jpa_projectexample.dao.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    
    AlumnoJpaController alumnoJPA = new AlumnoJpaController();
    CarreraJpaController carreraJPA = new CarreraJpaController();
    MateriaJpaController materiaJPA = new MateriaJpaController();

    /* ==================== Alumno ==================== */
    public void crearAlumno(Alumno alumno) {
        alumnoJPA.create(alumno);
    }

    public void eliminarAlumno(int id) {
        try {
            alumnoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alumno) {   
        try {
            alumnoJPA.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarAlumnoCarrera(int idAlumno, int idCarera){
        alumnoJPA.editAlumnoCarrera(idAlumno, idCarera);
    }

    public Alumno buscarAlumno(int id) {
        return alumnoJPA.findAlumno(id);
    }

    public List<Alumno> buscarAlmnos() {
        return alumnoJPA.findAlumnoEntities();
    }
    
    /* ==================== Carrera ==================== */
    public void crearCarrera(Carrera carrera) {
        carreraJPA.create(carrera);
    }
    
    public void eliminarCarrera(int id) {
        try {
            carreraJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarCarrera(Carrera carrera) {   
        try {
            carreraJPA.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public Carrera buscarCarrera(int id) {
        return carreraJPA.findCarrera(id);
    }

    public List<Carrera> buscarCarreras() {
        return carreraJPA.findCarreraEntities();
    }
    
    public void addMateriaCarrera(int idCarrera, List<Integer> idMaterias) {
        carreraJPA.addMateriaCarrera(idCarrera, idMaterias);
    }

    /* ==================== Materia ==================== */
    public void crearMateria(Materia materia) {
        materiaJPA.create(materia);
    }

    public List<Materia> buscarMaterias() {
        return materiaJPA.findMateriaEntities();
    }

}
