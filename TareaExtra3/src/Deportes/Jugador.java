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
public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    
    public Jugador(String n, String p, int e){
        nombre=n;
        posicion=p;
        edad=e;
    }
    
    public void establecer_nombreJ(String n){
        nombre=n;
    }
    public void establecer_posicion(String p){
        posicion=p;
    }
    public void establecer_edadJ(int e){
        edad=e;
    }
    
    public String obtener_nombreJ(){
        return nombre;
    }
    public String obtener_posicion(){
        return posicion;
    }
    public int obtener_edadJ(){
        return edad;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("%s - %s - %d años",obtener_nombreJ(),obtener_posicion(),obtener_edadJ());
        return cadena;
    }
}
