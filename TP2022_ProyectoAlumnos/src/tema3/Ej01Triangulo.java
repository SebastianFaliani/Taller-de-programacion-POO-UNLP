/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.*;
/**
 *
 * @author nedas
 */
public class Ej01Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo triangulo=new Triangulo();
        System.out.print("Ingrese Lado A del Triangulo: ");
        triangulo.setLadoA(Lector.leerDouble());
        System.out.print("Ingrese Lado B del Triangulo: ");
        triangulo.setLadoB(Lector.leerDouble());
        System.out.print("Ingrese Lado C del Triangulo: ");
        triangulo.setLadoC(Lector.leerDouble());
        System.out.println();
        Triangulo triangulo2=new Triangulo(2,3,4,"rojo","azul");
        System.out.println(triangulo.calcularArea());
        System.out.println(triangulo.calcularPerimetro());
    }
    
}
