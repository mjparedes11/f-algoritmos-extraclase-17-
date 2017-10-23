/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_academico.*;
import paquete_estudiante.Estudiante;
import paquete_general.Pais;

/**
 *
 * @author MIlton Paredes
 */
public class Principal {
    public static void main(String[] args) {
        //Caso 1
        System.out.println("Caso 1");
        
        Estudiante a=new Estudiante();
        a.establecer_nombresE("Luis V.");
        a.establecer_apellidosE("Perez J.");
        
        Pais p=new Pais();
        p.establecer_nombreP("Ecuador");
        
        Universidad b=new Universidad();
        b.establecer_nombreU("Universidad Técnica Particular de Loja");
        b.establecer_siglas("UTPL");
        b.establecer_pais(p);
        
        a.establecer_universidad(b);
        
        Asignatura c= new Asignatura();
        c.establecer_nombreA("Matemáticas");
        c.establecer_creditos(10);
                
        Carrera e=new Carrera();
        e.establecer_nombreC("Sistemas");
        e.establecer_modalidad("presencial");
        
        c.establecer_carrera(e);
        
        Docente f=new Docente();
        f.establecer_nombresD("Mario");
        f.establecer_apellidosD("Alcivar");
        
        Pais g=new Pais();
        g.establecer_nombreP("Colombia");
        f.establecer_pais(g);
        
        c.establecer_Docente(f);
        
        a.establecer_asignatura1(c);
        
        Asignatura d=new Asignatura();
        d.establecer_nombreA("Física");
        d.establecer_creditos(8);
        
        Carrera h=new Carrera();
        h.establecer_nombreC("Sistemas");
        h.establecer_modalidad("presencial");
        
        d.establecer_carrera(h);
        
        Docente i=new Docente();
        i.establecer_nombresD("Maria");
        i.establecer_apellidosD("Ruiz");
        
        Pais j=new Pais();
        j.establecer_nombreP("Perú");
        i.establecer_pais(j);
        
        d.establecer_Docente(i);
        
        a.establecer_asignatura2(d);
        
        System.out.println(a);
        
        //Caso 2
        System.out.println("\nCaso 2");
        
        Estudiante a2=new Estudiante();
        a2.establecer_nombresE("Ana.");
        a2.establecer_apellidosE("Lima J.");
        
        Pais p2=new Pais();
        p2.establecer_nombreP("Ecuador");
        
        Universidad b2=new Universidad();
        b2.establecer_nombreU("Universidad Técnica Equinoccial");
        b2.establecer_siglas("UTE");
        b2.establecer_pais(p2);
        
        a2.establecer_universidad(b2);
        
        Asignatura c2= new Asignatura();
        c2.establecer_nombreA("Biología");
        c2.establecer_creditos(9);
                
        Carrera e2=new Carrera();
        e2.establecer_nombreC("Ingeniería Química");
        e2.establecer_modalidad("presencial");
        
        c2.establecer_carrera(e2);
        
        Docente f2=new Docente();
        f2.establecer_nombresD("Luis");
        f2.establecer_apellidosD("Armijos");
        
        Pais g2=new Pais();
        g2.establecer_nombreP("Venezuela");
        f2.establecer_pais(g2);
        
        c2.establecer_Docente(f2);
        
        a2.establecer_asignatura1(c2);
        
        Asignatura d2=new Asignatura();
        d2.establecer_nombreA("Física");
        d2.establecer_creditos(7);
        
        Carrera h2=new Carrera();
        h2.establecer_nombreC("Ingeniería Química");
        h2.establecer_modalidad("distancia");
        
        d2.establecer_carrera(h2);
        
        Docente i2=new Docente();
        i2.establecer_nombresD("Maria");
        i2.establecer_apellidosD("Ruiz");
        
        Pais j2=new Pais();
        j2.establecer_nombreP("Perú");
        i2.establecer_pais(j2);
        
        d2.establecer_Docente(i2);
        
        a2.establecer_asignatura2(d2);
        
        System.out.println(a2);
    }
}
