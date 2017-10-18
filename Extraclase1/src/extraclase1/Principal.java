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
public class Principal {
    public static void main(String[] args) {
        //Caso 1
        System.out.println("Caso 1");
        
        Docente a=new Docente();
        a.establecer_nombres("Luis V.");
        a.establecer_apellidos("Perez J.");
        
        Asignatura b=new Asignatura();
        b.establecer_nombreA("Matemáticas ");
        b.establecer_creditos(8);
        Asignatura c=new Asignatura();
        c.establecer_nombreA("Física ");
        c.establecer_creditos(6);
        
        Titulo d=new Titulo();
        d.establecer_nombreT("Licenciado en Físico Matemáticas");
        d.establecer_nombre_universidad("Universidad Politécnica");
        Titulo e=new Titulo();
        e.establecer_nombreT("Magister en Docencia Matemática");
        e.establecer_nombre_universidad("Universidad Valenciana");
        
        
        a.establecer_asignatura1(b.obtener_nombreA(), b.obtener_creditos());
        a.establecer_asignatura2(c.obtener_nombreA(), c.obtener_creditos());
        a.establecer_titulo_tercer_nivel(d.obtener_nombreT()+" - "+d.obtener_nombre_universidad());
        a.establecer_titulo_cuarto_nivel(e.obtener_nombreT()+" - "+e.obtener_nombre_universidad());
        
        System.out.println(a);
        System.out.println("\n\n");
        
        
        //Caso2
        System.out.println("Caso 2");
        Docente f=new Docente();
        f.establecer_nombres("Ana M.");
        f.establecer_apellidos("Velez P.");
        
        Asignatura g=new Asignatura();
        g.establecer_nombreA("Sociales ");
        g.establecer_creditos(9);
        Asignatura h=new Asignatura();
        h.establecer_nombreA("Literatura ");
        h.establecer_creditos(10);
        
        Titulo i=new Titulo();
        i.establecer_nombreT("Licenciado en Ciencias Sociales");
        i.establecer_nombre_universidad("Universidad Saleciana");
        Titulo j=new Titulo();
        j.establecer_nombreT("Magister en Docencia Social");
        j.establecer_nombre_universidad("Universidad Cataluña");
        
        
        f.establecer_asignatura1(g.obtener_nombreA(), g.obtener_creditos());
        f.establecer_asignatura2(h.obtener_nombreA(), h.obtener_creditos());
        f.establecer_titulo_tercer_nivel(i.obtener_nombreT()+" - "+i.obtener_nombre_universidad());
        f.establecer_titulo_cuarto_nivel(j.obtener_nombreT()+" - "+j.obtener_nombre_universidad());
        
        System.out.println(f);
    }
}
