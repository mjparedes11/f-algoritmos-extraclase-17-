/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_general;

/**
 *
 * @author MIlton Paredes
 */
public class Pais {
    private String pais;
    
    public void establecer_nombreP(String n){
        pais=n;
    }
    public String obtener_nombreP(){
        return pais;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("%s",obtener_nombreP());
        return cadena;
    }
}
