/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author abollaita
 */
public class MainCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo1 = new Circulo(2);
        
        System.out.println("Area " + circulo1.areaCirculo());
        System.out.println("Perimetro: " + circulo1.perimetroCircuto());
    }
    
    
}
