/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgrupacionCarnaval;

/**
 *
 * @author Usuario
 */
public class MainCarnaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AgrupacionCarnaval nuevo = new AgrupacionCarnaval("Amarrosa", 1, "Juan Carlos Amargón", "Pitbull", 12); 
        
        System.out.println(nuevo.isCorrecto());
        nuevo.puntuar(40);
        System.out.println(nuevo.getPuntuación());
        System.out.println(nuevo.toString());
    }
    
}
