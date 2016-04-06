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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla();
        Bombilla bombilla3 = new Bombilla();
        bombilla1.encender();
        bombilla2.encender();
        bombilla3.apagar();
        Bombilla.interruptorGeneral = false;
        System.out.println("Estado bombilla1: " + bombilla1);
        System.out.println("Estado bombilla2: " + bombilla2);
        System.out.println("Estado bombilla3: " + bombilla3);
        Bombilla.interruptorGeneral = true;
        System.out.println("Estado bombilla1: " + bombilla1);
        System.out.println("Estado bombilla2: " + bombilla2);
        System.out.println("Estado bombilla3: " + bombilla3);
    }
    
}
