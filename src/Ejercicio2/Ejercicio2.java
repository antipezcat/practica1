/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author abollaita
 */
public class Ejercicio2 {
    public static void main(String[] arg) {
        
        Scanner teclado=new Scanner(System.in);
        System.out.print("Ingrese primer valor:");
        int valor1=teclado.nextInt();
        System.out.print("Ingrese segundo valor:");
        int valor2=teclado.nextInt();
        System.out.print("Ingrese tercer valor:");
        int valor3=teclado.nextInt();
        int max, min, inter;
        if( valor1 >= valor2 && valor2 >= valor3){ max = valor1;}
        else if ( valor2 >= valor1 && valor2 >= valor3) { max = valor2;}
        else{ max = valor3; }
        
        if( valor1 <= valor2 && valor2 <= valor3){ min = valor1;}
        else if ( valor2 <= valor1 && valor2 <= valor3) { min = valor2;}
        else{ min = valor3; }
        
        if ( valor1 != max && valor1 !=min){ inter = valor1; }
        else if ( valor2 != max && valor2 !=min){ inter = valor2; }
        else inter=valor3;
        
        
       if (valor1 ==  min && valor2 ==inter && valor3 == max) {
           System.out.println("java Orden Numerico " + valor1 + " " + valor2 + " " + valor3 +
                   "\nLas cantidades introducida están en orden numérico \n\n"); }
       else{
       
           System.out.println("java Orden Numerico " + + valor1 + " " + valor2 
           + " "+valor3+ "\nLas cantidades introducida no están en orden numérico"
           + "\nEl orden correcto es " + min + " " + inter + " " + max);
       
       }
        
        
        
        
        
        
        
        
        
        } 
                   
}
