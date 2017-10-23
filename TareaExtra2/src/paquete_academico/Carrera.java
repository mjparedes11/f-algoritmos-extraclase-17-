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
public class Carrera {
    private String nombre;
    private String modalidad;
    
    public void establecer_nombreC(String n){
        nombre=n;
    }
    public void establecer_modalidad(String n){
        modalidad=n;
    }
    
    public String obtener_nombreC(){
        return nombre;
    }
    public String obtener_modalidad(){
        return modalidad;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("%s - modalidad (%s)",obtener_nombreC(),obtener_modalidad() );
        return cadena;
    }
}
