

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Francisco A. Reyes
 */
public class Reloj {

    
    
    private int hora;
    private int minutos;
    private int segundos;
    private String horaCompleta = this.hora + ":" + this.minutos + ":" + this.segundos;
    private String AMPM;

    public static final int FORMATO24HORAS = 1;
    public static final int FORMATO12HORAS = 2;
    
    final int AM = 0;
    final int PM = 1;

    //Metodo Constructor sin parametros
    Reloj() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    //Metodo constructor con parametros

    Reloj(int horas, int minuto, int segundo) {
        if (horas > 23 || horas < 0) {
            this.horaCompleta = "Error, valor hora mal introducido";
        } else {
            this.hora = horas;
        }

        if (minuto > 59 || minuto < 0) {
            this.horaCompleta = "Error, valor minuto";
        } else {
            this.minutos = minuto;
        }

        if (segundo > 59 || segundo < 0) {
            this.horaCompleta="Error, valor segundos";
        } else {
            this.segundos = segundo;
        }
        horaCompleta = this.hora + ":" + this.minutos + ":" + this.segundos;
    }

    String getHora(int introduceFormatoHoras) {
        if (introduceFormatoHoras == FORMATO24HORAS) {
            return horaCompleta;
        } else {
            if (introduceFormatoHoras == FORMATO12HORAS) {
                if (this.hora > 12) {
                    this.hora = this.hora - 12;
                    horaCompleta = this.hora + ":" + this.minutos + ":" + this.segundos;
                    return horaCompleta.concat(" PM");
                } else {
                    return horaCompleta.concat(" AM");
                }
            } else {
                return null;
            }
        }
    }

    void setHora(int horas, int minuto) {
        if (horas > 23 || horas < 0) {
            this.horaCompleta = "Error, valor hora mal introducido";
        } else {
            this.hora = horas;
        }

        if (minuto > 59 || minuto < 0) {
            this.horaCompleta = "Error, valor minuto";
        } else {
            this.minutos = minuto;
        }
        
        horaCompleta = this.hora + ":" + this.minutos + ":" + this.segundos;
    }

    void setHoraCompleta(int horas, int minuto, int segundo) {
        if (horas > 23 || horas < 0) {
            this.horaCompleta = "Error, valor hora mal introducido";
        } else {
            this.hora = horas;
        }

        if (minuto > 59 || minuto < 0) {
             this.horaCompleta = "Error, valor minuto";
        } else {
            this.minutos = minuto;
        }

        if (segundo > 59 || segundo < 0) {
            this.horaCompleta="Error, valor segundos";
        } else {
            this.segundos = segundo;
        }
        
        horaCompleta = this.hora + ":" + this.minutos + ":" + this.segundos;
    }

    void setHoraCompleta12(int horas, int minuto, int segundo, int periodoDia) {
        if (horas > 11 || horas < 0) {
            this.horaCompleta = "Error, valor hora mal introducido";
        } else {
            this.hora = horas;
        }

        if (minuto > 59 || minuto < 0) {
             this.horaCompleta = "Error, valor minuto";
        } else {
            this.minutos = minuto;
        }

        if (segundo > 59 || segundo < 0) {
            this.horaCompleta="Error, valor segundos";
        } else {
            this.segundos = segundo;
        }
        if (periodoDia== AM) {
            this.AMPM="AM";
        } else {
            if (periodoDia==PM) {
                this.AMPM="PM";
            }
        }
        
        this.horaCompleta = this.hora + ":" + this.minutos + ":" + this.segundos + " " + this.AMPM;

    }
}
