/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author nedas
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventoOcacional eo=new EventoOcacional("show privado","sebas",5,"Los panqueques",3);
        eo.agregarTema("tema1");
        eo.agregarTema("tema2");
        eo.agregarTema("tema3");
        
        System.out.println(eo.actuar());
        
        System.out.println("Costo calculado: " + eo.calcularCosto());
        
        Gira gira=new Gira("La re Gira",3,"La re Banda",4);
        gira.agregarTema("tema1");
        gira.agregarTema("tema2");
        gira.agregarTema("tema3");
        gira.agregarTema("tema4");
        
        gira.agregarFecha(new FechaRecital(1,"Ensenada"));
        gira.agregarFecha(new FechaRecital(2,"Berisso"));
        gira.agregarFecha(new FechaRecital(3,"La plata"));
        
        System.out.println(gira.actuar());
        System.out.println(gira.actuar());
        System.out.println(gira.actuar());
        
        
        System.out.println("Costo calculado: " + gira.calcularCosto());
    }
    
}
