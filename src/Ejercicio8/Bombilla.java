/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio8;

/**
 *
 * @author abollaita
 */

/* Queremos modelar una casa con muchas bombillas, de forma que cada bombilla se
puede encender o apagar individualmente. Para ello haremos una clase Bombilla con una
variable privada que indique si está encendida o apagada, así como un método que nos
diga si una bombilla concreta está encendida. Además queremos poner un interruptor
general de la luz, tal que si saltan los fusibles, todas las bombillas quedan apagadas.
Cuando el fusible se repara, las bombillas vuelven a estar encendidas o apagadas, según
estuvieran antes del percance. Para modelar en Java esta característica usaremos una
variable de clase (estática) que nos diga si hay luz en el edificio o no. Cada objeto
Bombilla se enciende y se apaga individualmente; pero sólo responde que está encendida
si su interruptor particular está activado y además hay luz general.*/
public class Bombilla {
    public static boolean interruptorGeneral = true;
    private boolean estadoBombilla; //Representa si la bombilla esta encendida o apagada
    
    public Bombilla(){
        estadoBombilla = false;
    }
    public void encender(){
       estadoBombilla = true;
    }
    public void apagar(){
       estadoBombilla = false;
    }
   
    public String verEstado(){
        String status;
        if (interruptorGeneral == true && estadoBombilla == true) {
            status = "Encendido";
        }
        else {
             status = "Apagado";
        } 
        return status;
    
    }
    
}
