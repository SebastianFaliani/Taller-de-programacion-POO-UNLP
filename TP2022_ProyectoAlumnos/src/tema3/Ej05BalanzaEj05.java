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
public class Ej05BalanzaEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pesoEnKg, precioPorKg;
        String descripcion;
        BalanzaEj05 balanza=new BalanzaEj05();
        Producto producto;
        
        balanza.iniciarCompra();
        System.out.print("Peso en Kg: ");
        pesoEnKg=Lector.leerDouble();
        while(pesoEnKg!=0){
            System.out.print("Precio por Kg: ");
            precioPorKg=Lector.leerDouble();
            System.out.print("Descripcion: ");
            descripcion=Lector.leerString();
            producto=new Producto(descripcion,pesoEnKg);
            balanza.registrarProductos(producto, precioPorKg);
            System.out.print("Peso en Kg: ");
            pesoEnKg=Lector.leerDouble();
        }
        System.out.println();
        System.out.println(balanza.getResumenDeCompra());
    }
    
}
