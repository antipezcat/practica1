/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Date;

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
        

        Estudiante estudiante1;
        estudiante1 = new Estudiante("Jose Perez",1160000,"809-413-7733", 3, 9);
        Estudiante estudiante2 = new Estudiante (1115674, "Immanuel Kant", 4);
       
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();
        Estudiante estudiante5 = new Estudiante();
        
        estudiante2.setFechaNacimiento( new Date());
        estudiante2.setTelefono("809-546-0000");
        estudiante2.escogerCiclo(7);
        
        estudiante3.setNombre("Maximo Corseti");
        estudiante3.setMatricula(1110000);
        estudiante3.setFechaNacimiento( new Date());
        estudiante3.setTelefono("809-546-6812");
        estudiante3.setIndice(3.7);
        estudiante2.escogerCiclo(10);
        estudiante3.mostrarInformacionEstudiante();
        
        estudiante4.setNombre("Brian Toribio");
        estudiante4.setMatricula(1117817);
        estudiante4.setFechaNacimiento( new Date());
        estudiante4.setTelefono("809-446-2812");
        estudiante4.setIndice(3.8);
        estudiante4.escogerCiclo(9);
        estudiante4.mostrarInformacionEstudiante();
        
        estudiante5.setNombre("Raynieri Guzman");
        estudiante5.setMatricula(1111070);
        estudiante5.setFechaNacimiento( new Date());
        estudiante5.setTelefono("829-877-7995");
        estudiante5.setIndice(3.0);
        estudiante5.escogerCiclo(9);
        estudiante5.mostrarInformacionEstudiante();
        
        
    }
    
}
