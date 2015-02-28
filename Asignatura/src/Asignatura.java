/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco A. Reyes
 */
public class Asignatura {

    String nombre;
    int CodNumerico;
    int CursoAcademico;

    Asignatura(String nombre, int codigoNumerico, int curso) {
        this.nombre=nombre;
        this.CodNumerico=codigoNumerico;
        this.CursoAcademico=curso;

    }
    
    String getNombre() {
        return this.nombre;
    }
    
    int getCodigoNumerico() {
        return this.CodNumerico;
    }
    
    int getCurso() {
        return this.CursoAcademico;
    }
}
