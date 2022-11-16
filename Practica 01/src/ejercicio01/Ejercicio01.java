/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;
import PaqueteLectura.*;
/**
 *
 * @author nedas
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto p1=new Proyecto("prueba",15,"El Jefe");
        
        Investigador inv1= new Investigador("Sebas Faliani",1,"Informatica");
        inv1.agregarSubsidio(new Subsidio(5000,"Buen Tipo"));
        inv1.agregarSubsidio(new Subsidio(15000,"Merito"));
        
        Investigador inv2= new Investigador("Cris Cardenas",2,"Musica");
        inv2.agregarSubsidio(new Subsidio(10000,"Cumple"));
        inv2.agregarSubsidio(new Subsidio(5000,"Se lo gano"));
        
        Investigador inv3= new Investigador("Eze Faliani",3,"Quimica");
        inv3.agregarSubsidio(new Subsidio(5000,"Beca"));
        inv3.agregarSubsidio(new Subsidio(12800,"Dedicacion"));
        
        p1.agregarInvestigador(inv1);
        p1.agregarInvestigador(inv2);
        p1.agregarInvestigador(inv3);
        
        p1.otorgarTodos("Sebas Faliani");
        //p1.otorgarTodos("Cris Cardenas");
        p1.otorgarTodos("Eze Faliani");
        
        System.out.println(p1);
    }
    
}
