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
public class Ej03Entrenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Entrenador entrenador=new Entrenador();
        System.out.print("Nombre: ");
        entrenador.setNombre(Lector.leerString());
        System.out.print("Sueldo Basico: ");
        entrenador.setSueldoBasico(Lector.leerDouble());
        System.out.print("Antigüedad: ");
        entrenador.setAntiguedad(Lector.leerInt());
        System.out.print("Campeonatos Ganados: ");
        entrenador.setCampeonatos(Lector.leerInt());
        
        Entrenador entrenador2=new Entrenador("Juan",90000,5,3);
        System.out.println();
        System.out.println(entrenador.calcularEfectividad());
        System.out.println(entrenador.calcularSueldoACobrar());
    }
    
}
