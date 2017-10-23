/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

import paquete_general.Pais;

/**
 *
 * @author MIlton Paredes
 */
public class Docente {
    private String nombres;
    private String apellidos;
    private Pais pais;
    
    public void establecer_nombresD(String n){
        nombres=n;
    }
    public void establecer_apellidosD(String a){
        apellidos=a;
    }
    public void establecer_pais(Pais p){
        pais=p;
    }
    
    public String obtener_nombresD(){
        return nombres;
    }
    public String obtener_apellidosD(){
        return apellidos;
    }
    public Pais obtener_pais(){
        return pais;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("Docente: %s %s - país %s",obtener_nombresD(),obtener_apellidosD(),obtener_pais());
        return cadena;
    }
}
