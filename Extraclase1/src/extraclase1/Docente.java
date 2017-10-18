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
public class Docente {
    private String nombres;
    private String apellidos;
    private String asignatura1;
    private String asignatura2;
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    
    public void establecer_nombres(String n){
        nombres=n;
    }
    public void establecer_apellidos(String a){
        apellidos=a;
    }
    public void establecer_asignatura1(String na, int ca){
        asignatura1= na + "con número de créditos " + ca;
    }
    public void establecer_asignatura2(String na, int ca){
        asignatura2= na + "con número de créditos " + ca;
    }
    public void establecer_titulo_tercer_nivel(String nt){
        titulo_tercer_nivel= nt;
    }
    public void establecer_titulo_cuarto_nivel(String nt){
       titulo_cuarto_nivel= nt;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    public String obtener_asignatura1(){
        return asignatura1;
    }
    public String obtener_asignatura2(){
        return asignatura2;
    }
    public String obtener_titulo_tercer_nivel(){
        return titulo_tercer_nivel;
    }
    public String obtener_titulo_cuarto_nivel(){
        return titulo_cuarto_nivel;
    }
    
    @Override
    public String toString(){
        String cadena;
        cadena="Datos del Docente:\n"
                + " Nombres: " +obtener_nombres()+"\n" 
                + " Apellidos: " +obtener_apellidos() +"\n"
                + "Tiene a su cargo las asignaturas:\n"
                + " Asignatura 1: " +obtener_asignatura1() +"\n"
                + " Asignatura 2: " +obtener_asignatura2() +"\n"
                + "El docente tiene los siguientes títulos académicos:\n"
                + " Título 3er nivel: " + obtener_titulo_tercer_nivel() +"\n"
                + " Título 4er nivel: " + obtener_titulo_cuarto_nivel();
        return cadena;
    }
}
