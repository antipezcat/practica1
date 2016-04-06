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
/*
Crear una clase “Mi_Clase” que posea un atributo de clase llamado “valor_clase” y otro
de instancia denominado “valor_instancia”. Debe tener los métodos correspondientes
para modificar y obtener el estado de cada uno de los atributos mencionados. Para el
atributo “valor_clase” se debe incrementar por cada objeto creado –inicialmente
inicializado en cero. Codificar una aplicación Java y crear varios objetos pertenecientes a
esta clase de manera que se pueda observar el valor de los atributos durante la ejecución
de la aplicación.


*/
public class Mi_Clase {
    
    static int valor_clase =0;
    int valor_instancia;
    
    public Mi_Clase (){
        valor_clase++; 
    }

    public static int getValor_clase() {
        return valor_clase;
    }

    public static void setValor_clase(int valor_clase) {
        Mi_Clase.valor_clase = valor_clase;
    }

    public int getValor_instancia() {
        return valor_instancia;
    }

    public void setValor_instancia(int valor_instancia) {
        this.valor_instancia = valor_instancia;
    }
    
    
    
    
    
    
}
