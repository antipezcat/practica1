/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

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
        Mi_Clase c1 = new Mi_Clase();
        Mi_Clase c2 = new Mi_Clase();
        Mi_Clase c3 = new Mi_Clase();
        Mi_Clase c4 = new Mi_Clase();
        System.out.println("Cuantos: " + Mi_Clase.getValor_clase());
        int a = 5;
        c2.setValor_instancia(a);
        System.out.println("Cuantos: " + c2.getValor_instancia());
    }
    
}
