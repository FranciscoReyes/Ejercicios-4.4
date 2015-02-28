/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco A. Reyes
 */
public class MainAsignatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura asig1 = new Asignatura("Matemáticas", 1017, 1);
        
        System.out.println("Asignatura: " + asig1.getNombre() + "\nCódigo: "+ asig1.getCodigoNumerico() 
                +"\nCurso: "+ asig1.getCurso());
       
    }
    
}
