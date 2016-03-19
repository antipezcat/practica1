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
public class Estudiante {
    String nombre;
    int matricula;
    Date fechaNacimiento;
    String telefono;
    double indice;
    int ciclo;
   
    public Estudiante (){}
    
    public Estudiante(String nombre, int matricula, String telefono , double indice , int ciclo){
        this.matricula = matricula;
        this.nombre=nombre;
        this.telefono=telefono;
        this.ciclo=ciclo;
        this.indice=indice;   
    }
    
    public Estudiante (int matricula, String nombre, double indice){
        this.matricula = matricula;
        this.nombre = nombre;
        this.indice = indice;
    }
    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void mostrarInformacionEstudiante(){ 
        System.out.printf("Matricula: %d, Nombre: %s,  ciclo %s \n", matricula, nombre, ciclo);
        System.out.printf("\n Fecha de nacimiemto: %d, Telefono: %s,  indice %s \n", fechaNacimiento, telefono, indice);    
    }
    
    public void estudiar(){
        System.out.printf("Estudiar asignatura");
    }
    
    public void escogerCiclo(int ciclo){
    this.ciclo = ciclo;
    }
    
    
    
}
