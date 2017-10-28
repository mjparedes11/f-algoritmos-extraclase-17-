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
public class Equipo {
    private String equipo;
    private String siglas;
    private int anio_fundación;
    private Jugador [] jugadores;
    private Tecnico [] tecnicos;
    private int promedio_edad_tecnicos=0;
    private int promedio_edad_jugadores=0;
    
    public Equipo(Tecnico a, Tecnico b, Tecnico c, Jugador d,Jugador e,Jugador f,Jugador g,Jugador h,Jugador i){
        tecnicos[0]=a;
        tecnicos[1]=b;
        tecnicos[2]=c;
        jugadores [0]=d;
        jugadores [1]=e;
        jugadores [2]=f;
        jugadores [3]=g;
        jugadores [4]=h;
        jugadores [5]=i;
        
        for (int j = 0; j < 3; j++) {
            promedio_edad_tecnicos=promedio_edad_tecnicos+tecnicos[j].obtener_edadT();
        }
        for (int j = 0; j < 10; j++) {
            promedio_edad_jugadores=promedio_edad_jugadores+jugadores[j].obtener_edadJ();
        }
    }
    public void establecer_equipo(String e){
        equipo=e;
    }
    public void establecer_siglas(String s){
        siglas=s;
    }
    public void establecer_anio(int a){
        anio_fundación=a;
    }
    
    
    public String obtener_equipo(){
        return equipo;
    }
    public String obtener_siglas(){
        return siglas;
    }
    public int obtener_anio(){
        return anio_fundación;
    }
    public int obtener_promedio_edad_tecnicos(){
        return promedio_edad_tecnicos;
    }
    public int obtener_promedio_edad_jugadores(){
        return promedio_edad_jugadores;
    }
    
    public String toString(){
        String cadena=String.format("Equipo: %s \n"
                + "Sus técnicos son:\n"
                + " %s\n"
                + " %s\n"
                + " %s\n"
                + "Sus jugadores son:\n"
                + " %s\n"
                + " %s\n"
                + " %s\n"
                + " %s\n"
                + " %s\n"
                + " %s\n"
                + "Promedio de edad de:\n"
                + " Tenicos: %d\n"
                + " Jugadores: %d",obtener_equipo(), tecnicos[0], tecnicos[1], tecnicos[2], jugadores [0], jugadores [1], jugadores [2], jugadores [3], jugadores [4], jugadores [5],obtener_promedio_edad_tecnicos(),obtener_promedio_edad_jugadores());
        return cadena;
    }
}
