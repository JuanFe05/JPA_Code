package com.mycompany.jpa_projectexample;

import com.mycompany.jpa_projectexample.logica.LogicController;
import java.util.List;

public class JPA_ProjectExample {

    public static void main(String[] args) {
        
        LogicController controller = new LogicController();
        
        //controller.crearAlumno();
        //controller.eliminarAlumno();
        //controller.editarAlumno();

        //System.out.println("========= Buscando un solo alumno =========");
        //System.out.println(controller.buscarAlumno(1));
        
        //System.out.println("========= Buscando varios alumnos =========");
        //controller.buscarAlumnos();
        
        //controller.crearCarrera();
        
        //controller.crearAlumno();
        
        //controller.eliminarCarrra();
        
        //controller.editarAlumnoCarrera();
        
        //controller.crearMateria();
        
        controller.addMateriasToCarrera();
                  
    }
}
