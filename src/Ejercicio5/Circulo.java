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
/*
Escriba una clase Java que represente un círculo; el círculo queda perfectamente
definido si se conoce su radio (pasarlo por el constructor como double). Defina además,
para esta clase, dos métodos (públicos) que permitan calcular el área del círculo y el
perímetro de la circunferencia que delimita el circulo. Para probar la funcionalidad antes
definida, escriba un pequeño programa que cree un círculo con un radio dado, y que
calcule (y muestre por pantalla) el área y el perímetro de su circunferencia. 

*/
public class Circulo {
    
    private double radio;
    public Circulo( double radio){
        this.radio = radio;
    }

    Circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double areaCirculo (){
        
        return Math.PI * Math.pow(radio,2);
    }
    
    public double perimetroCircuto(){
       
        return radio * 2 * Math.PI;
    
    }
    
}
