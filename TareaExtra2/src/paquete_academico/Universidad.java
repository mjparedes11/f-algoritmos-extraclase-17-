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
public class Universidad {
    private String nombre;
    private String siglas;
    private Pais pais;
    
    public void establecer_nombreU(String n){
        nombre=n;
    } 
    public void establecer_siglas(String n){
        siglas=n;
    }
    public void establecer_pais(Pais p){
        pais=p;
    }
    
    public String obtener_nombreU(){
        return nombre;
    }
    public String obtener_siglas(){
        return siglas;
    }
    public Pais obtener_pais(){
        return pais;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("%s(%s) - %s",obtener_nombreU(),obtener_siglas(),obtener_pais());
        return cadena;
    }
}
