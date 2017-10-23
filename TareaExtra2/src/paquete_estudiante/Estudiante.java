/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;

import paquete_academico.Asignatura;
import paquete_academico.Universidad;

/**
 *
 * @author MIlton Paredes
 */
public class Estudiante {
    private String nombresE;
    private String apellidosE;
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Universidad universidad;
    
    public void establecer_nombresE(String n){
        nombresE=n;
    }
    public void establecer_apellidosE(String a){
        apellidosE=a;
    }
    public void establecer_asignatura1(Asignatura a){
        asignatura1=a;
    }
    public void establecer_asignatura2(Asignatura a){
        asignatura2=a;
    }
    public void establecer_universidad(Universidad u){
        universidad=u;
    }
    
    public String obtener_nombresE(){
        return nombresE;
    }
    public String obtener_apellidosE(){
        return apellidosE;
    }
    public Asignatura obtener_asignatura1(){
        return asignatura1;
    }
    public Asignatura obtener_asignatura2(){
        return asignatura2;
    }
    public Universidad obtener_universidad(){
        return universidad;
    }
    
    public String toString(){
        String cadena=String.format("Datos del Estudiante:\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "%s\n"
                + "Tiene las siguientes asignaturas;\n"
                + " Asinatura1: %s\n"
                + " Asignatura2: %s",obtener_nombresE(),obtener_apellidosE(),obtener_universidad(),obtener_asignatura1(),obtener_asignatura2());
        return cadena;
    }
}
