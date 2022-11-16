/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author nedas
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Estacionamiento esta= new Estacionamiento("El Lugar","Juan B Justo",3,3);
        Auto a1=new Auto("Sebas","a1");
        Auto a2=new Auto("Sebas","a2");
        Auto a3=new Auto("Sebas","a3");
        Auto a4=new Auto("Sebas","a4");
        Auto a5=new Auto("Sebas","a5");
        Auto a6=new Auto("Sebas","a6");
        
        esta.registrarAuto(a1, 1, 1);//00
        esta.registrarAuto(a2, 1, 3);//02
        esta.registrarAuto(a3, 2, 1);//10
        esta.registrarAuto(a4, 2, 2);//11
        esta.registrarAuto(a5, 3, 1);//20
        esta.registrarAuto(a6, 3, 3);//22
        
        System.out.println(esta.toString());
        
        System.out.println(esta.buscarAuto("a2"));
        
        System.out.println(esta.cantidadAutosPorPlaza(1));
    }
    
}
