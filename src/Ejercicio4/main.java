/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import Ejercicio5.Circulo;

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
        
        Edificio edificio1 = new Edificio();
        
        edificio1.setNombre("Edificio empresarial");
        edificio1.setNumPisos(4);
        edificio1.setNumPuertas(20);
        
        System.out.println("Nombre del edificio: " + edificio1.getNombre());
        System.out.println("Numero de pisos: " + edificio1.getNumPisos());
        edificio1.mostrarInformacionEdificio();
 
    }
    
}
