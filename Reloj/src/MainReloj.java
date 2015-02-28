/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco A. Reyes
 */
public class MainReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reloj relóh = new Reloj(14, 50, 30);
        
        System.out.println(relóh.getHora(2));
        
        relóh.setHoraCompleta(15, 30, 40);
        
        System.out.println(relóh.getHora(relóh.FORMATO24HORAS));
        
        relóh.setHoraCompleta12(20, 15, 30, 1);
        
        System.out.println(relóh.getHora(relóh.FORMATO12HORAS));
        
        
        
        
    }
    
}
