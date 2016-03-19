/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author abollaita
 */

/*  Escribir una clase llamada Edificio que en el constructor se le pueda pasar la cantidad
de pisos que tendrás,el nombre y el numero de puerta y que existan métodos que
permitan cambiar cada uno dichas propiedades e imprimir cada uno en pantalla.*/

public class Edificio {
 
    int numPisos;
    String nombre;
    int numPuertas;
    
    public Edificio() {}
    
    public Edificio (String nombre, int npisos, int npuertas ) {
    this.nombre = nombre;
    this.numPisos= npisos;
    this.numPuertas= npuertas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    public void mostrarInformacionEdificio(){
        
        System.out.printf(" Nombre: %s | Numero de pisos: %s | Numero de puertas:"
                + "%s ", nombre,numPisos, numPuertas);


}
    
    
}
