/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgrupacionCarnaval;

/**
 *
 * @author Francisco A. Reyes
 */
public class AgrupacionCarnaval {

    String nombre;
    int categoria;
    String autorLetra;
    String autorMúsica;
    int numComponentes;
    private int puntuación;
    boolean puntuado = false;

    final int CHIRIGOTA = 1;
    final int COMPARSA = 2;
    final int CORO = 3;
    final int CUARTETO = 4;

    AgrupacionCarnaval(String nombre, int categoría, String autorLetra, String autorMúsica, int componentes) {
        this.nombre = nombre;
        this.categoria = categoría;
        this.autorLetra = autorLetra;
        this.autorMúsica = autorMúsica;
        this.numComponentes = componentes;
    }

    AgrupacionCarnaval(String nombre, int categoría, String autorLetraYMúsica, int componentes) {
        this.nombre = nombre;
        this.categoria = categoría;
        this.autorLetra = autorLetraYMúsica;
        this.autorMúsica = autorLetraYMúsica;
        this.numComponentes = componentes;
    }

    boolean isCorrecto() {

        if (this.nombre.equalsIgnoreCase("")) {
            puntuado=false;
            return false;
        } else {
            if (this.categoria < 1 || this.categoria > 4) {
                puntuado=false;
                return false;
            } else {
                if ((this.numComponentes > 12 || this.numComponentes < 7) && (this.categoria == this.CHIRIGOTA)) {
                    puntuado=false;
                    return false;
                } else {
                    if ((this.numComponentes > 15 || this.numComponentes < 10) && (this.categoria == this.COMPARSA)) {
                        puntuado=false;
                        return false;
                    } else {
                        if ((this.numComponentes > 45 || this.numComponentes < 16) && (this.categoria == this.CORO)) {
                            puntuado=false;
                            return false;
                        } else {
                            if ((this.numComponentes > 5 || this.numComponentes < 3) && (this.categoria == this.CUARTETO)) {
                                puntuado=false;
                                return false;
                            } else {
                                puntuado=true;
                                return true;
                                
                            }
                        }
                    }
                }
            }
        }
    }
    
    boolean puntuar (int puntuacion) {
        this.puntuación=0;
        this.puntuación=puntuacion;
        if (this.puntuación == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    boolean puntuar (int presentación, int pasodobles, int cuplés, int popurrí) {
        this.puntuación = presentación + pasodobles + cuplés + popurrí;
        if ((presentación > 10 || presentación < 0) || (pasodobles > 40 || pasodobles < 0) 
                || (cuplés > 30 || cuplés < 0) || (popurrí > 20 || popurrí < 0)) {
            return false; 
        } else {
            return true;
        }
        
    }

    public int getPuntuación() {
        if (puntuado = true) {
            return puntuación;

        } else {
            return 0;
        }
    }
    
    public String toString() {
        return "Nombre: " + this.nombre + "\nCategoría: " + this.categoria + "\nPuntuación: " + this.puntuación;
    }
    
}
