/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraclase1;

/**
 *
 * @author MIlton Paredes
 */
public class Titulo {
    private String nombre;
    private String nombre_universidad;
    
    public void establecer_nombreT(String n){
        nombre=n;
    }
    public void establecer_nombre_universidad(String o){
        nombre_universidad=o;
    }
    
    public String obtener_nombreT(){
        return nombre;
    }
    public String obtener_nombre_universidad(){
        return nombre_universidad;
    }
    
}
