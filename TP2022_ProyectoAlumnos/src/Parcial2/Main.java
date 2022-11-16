/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;
import PaqueteLectura.Lector;
/**
 *
 * @author nedas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SorteoAvanzado sorteoAvanzado=new SorteoAvanzado(50000);
        System.out.println(sorteoAvanzado.agregarPersona(new Persona("sebas",24999458,25)));
        System.out.println(sorteoAvanzado.agregarPersona(new Persona("Cris",24999458,9)));
        System.out.println(sorteoAvanzado.agregarPersona(new Persona("Pri",24999458,17)));
        System.out.println(sorteoAvanzado.agregarPersona(new Persona("ekel",24999458,8)));
        System.out.println(sorteoAvanzado.devolverQuienCompro(Lector.leerInt()));
        System.out.println(sorteoAvanzado.devolverGanador());
    }
    
}
