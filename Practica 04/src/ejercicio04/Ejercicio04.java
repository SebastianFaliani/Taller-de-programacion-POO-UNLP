/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author nedas
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        
        Director dir1=new Director(GeneradorAleatorio.generarInt(5),GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        Corista co1=new Corista(1,GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        Corista co2=new Corista(1,GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        Corista co3=new Corista(1,GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        Corista co4=new Corista(2,GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        Corista co5=new Corista(2,GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        Corista co6=new Corista(2,GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        Corista co7=new Corista(3,GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        Corista co8=new Corista(3,GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        Corista co9=new Corista(3,GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        
        CoroSemicircular cs=new CoroSemicircular(3,dir1);
        
        cs.setNombreCoro("Coro Semicircular");
        
        cs.agregarCorista(co1);
        cs.agregarCorista(co2);
        cs.agregarCorista(co3);
        //cs.agregarCorista(co4);

        
        /*System.out.println(cs.toString());
        System.out.println(cs.estaLlenoElCoro());
        System.out.println(cs.estaBienFormadoElCoro());
        System.out.println();*/
        
        Director dir2=new Director(GeneradorAleatorio.generarInt(5),GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(45000000),GeneradorAleatorio.generarInt(99));
        CoroPorHileras ch=new CoroPorHileras(3,3,dir2);
        
        ch.setNombreCoro("Coro Por Hileras");
        
        ch.agregarCorista(co1);
        ch.agregarCorista(co2);
        ch.agregarCorista(co3);
        ch.agregarCorista(co4);
        ch.agregarCorista(co5);
        ch.agregarCorista(co6);
        ch.agregarCorista(co7);
        ch.agregarCorista(co8);
        //ch.agregarCorista(co9);
        
        System.out.println(ch.toString());
        System.out.println(ch.estaLlenoElCoro());
        System.out.println(ch.estaBienFormadoElCoro());
    }
    
}
