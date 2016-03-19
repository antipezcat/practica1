/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio6;

import java.text.DecimalFormat;

/**
 *
 * @author abollaita
 */
public class SintonizadorDigitalFM {

   private double frecuencia;
     DecimalFormat decimales = new DecimalFormat("0.00");
    
    public SintonizadorDigitalFM(){
        this.frecuencia = 80;
    }
    
    public void up() {
        
        frecuencia += 0.5;
        if (frecuencia > 108.0) { frecuencia = 80.0;}
    }
    
     public void down() {
        frecuencia -= 0.5;
        if (frecuencia < 80.0 ) { frecuencia = 108.0;}
    }
     
    public void imprimirFrecuencia () {
        System.out.println("Frecuencia: " + decimales.format(frecuencia));
    }
}
