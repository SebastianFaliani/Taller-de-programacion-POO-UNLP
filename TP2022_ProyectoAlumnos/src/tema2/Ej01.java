/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author nedas
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona=new Persona();
        System.out.println("Ingrese Nombre: ");
        persona.setNombre(Lector.leerString());
        System.out.println("Ingrese DNI: ");
        persona.setDNI(Lector.leerInt());
        System.out.println("Ingrese Edad: ");
        persona.setEdad(Lector.leerInt());
        System.out.println(persona.toString());
    }
    
}
