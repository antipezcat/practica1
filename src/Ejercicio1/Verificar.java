/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author abollaita
 */
public class Verificar {
    
    public static void main(String[] args) { // Incluir el array de objetos string
        System.out.println("Fundacion Codigo Libre"); //Las comillas simples
        int a = 10;  //Faltaba ';'
        int b = 3;
        System.out.println("Datos a operar: a=" +a +" y b="+b);//Para concatenar
                                                              //se utiliza '+'
        System.out.println("La multiplicacion vale "+(a*b)); //Sacar la operacion
                                                          //del string
        int c = a+b;
        System.out.println("La suma es "+ (a+b)); // Es mejor poner parentesis 
        System.out.println(a+b + " tambien es la suma");
        System.out.println("O lo que es lo mismo "+c);
        c = a-b; //La variable se ya fue definida previamente
        System.out.println("La resta es "+c);
        System.out.println("La resta es tambien "+ (a-b));//Colocar operacion en 
                                                         //En parentesis 
        
 }    
}
