/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author abollaita
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SintonizadorDigitalFM sintonizador = new SintonizadorDigitalFM();
        
       for (int i = 0; i < 56; i++){
       sintonizador.up();
       sintonizador.imprimirFrecuencia();
       }
       
       for (int i = 0; i < 57; i++){
       sintonizador.down();
       sintonizador.imprimirFrecuencia();
       }
    }
    
}
