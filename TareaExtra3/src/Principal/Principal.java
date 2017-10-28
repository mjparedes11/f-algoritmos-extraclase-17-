/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Deportes.Equipo;
import Deportes.Jugador;
import Deportes.Tecnico;

/**
 *
 * @author MIlton Paredes
 */
public class Principal {
    public static void main(String[] args) {
        Tecnico a=new Tecnico("Luis Gomez ","Técnico Principal ",45);        
        Tecnico b=new Tecnico("Julio Neto ","Asistente Técnico ",46);
        Tecnico c=new Tecnico("Marco Silva ","Preparador Físico ",47);
        
        Jugador d=new Jugador("Manuel Alvarez ","Arquero ",20);
        Jugador e=new Jugador("Eduardo Valencia ","Defensa ",21);
        Jugador f=new Jugador("Fabian Cevallos ","Defensa",30);
        Jugador g=new Jugador("Antonio Lara ","Centrocampista ",32);
        Jugador h=new Jugador("Luis Delgado ","Centrocampista",17);
        Jugador i=new Jugador("Xavier Lopez ","Delantero",25);
        
        Equipo x=new Equipo(a,b,c,d,e,f,g,h,i);
        x.establecer_equipo("Boca Juniors");
        x.establecer_siglas("BJ");
        x.establecer_anio(1970);
        
        System.out.println(x);
    }
}
