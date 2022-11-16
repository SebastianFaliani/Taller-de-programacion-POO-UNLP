/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author nedas
 */
public class Ej04Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo=new Circulo();
        
        System.out.print("Radio: ");
        circulo.setRadio(Lector.leerDouble());
        System.out.print("Color de relleno: ");
        circulo.setColorRelleno(Lector.leerString());
        System.out.print("Color de linea: ");
        circulo.setColorLinea(Lector.leerString());
        
        Circulo circulo2=new Circulo(2,"Amarillo","Azul");
        System.out.println();
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
    }
    
}
