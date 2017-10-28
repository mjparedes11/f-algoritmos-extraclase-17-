/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deportes;

/**
 *
 * @author MIlton Paredes
 */
public class Tecnico {
    private String nombre;
    private String funcion;
    private int edad;
    
    public Tecnico(String n, String f, int e){
        nombre=n;
        funcion=f;
        edad=e;
    }
    
    public void establecer_nombreT(String n){
        nombre=n;
    }
    public void establecer_funcion(String f){
        funcion=f;
    }
    public void establecer_edadT(int e){
        edad=e;
    }
    
    public String obtener_nombreT(){
        return nombre;
    }
    public String obtener_funcion(){
        return funcion;
    }
    public int obtener_edadT(){
        return edad;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("%s - %s - %d años",obtener_nombreT(),obtener_funcion(),obtener_edadT());
        return cadena;
    }
}
