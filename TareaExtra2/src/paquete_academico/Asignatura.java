/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author MIlton Paredes
 */
public class Asignatura {
    private String nombreA;
    private int creditos;
    private Carrera carrera;
    private Docente docente;
    
    public void establecer_nombreA(String n){
        nombreA=n;
    }
    public void establecer_creditos(int c){
        creditos=c;
    }
    public void establecer_carrera(Carrera c){
        carrera=c;
    }
    public void establecer_Docente(Docente d){
        docente=d;
    }
    
    public String obtener_nombreA(){
        return nombreA;
    }
    public int obtener_creditos(){
        return creditos;
    }
    public Carrera obtener_carrera(){
        return carrera;
    }
    public Docente obtener_docente(){
        return docente;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("%s (%d créditos) de la carrera %s. %s",obtener_nombreA(),obtener_creditos(),obtener_carrera(),obtener_docente());
        return cadena;
    }
}
