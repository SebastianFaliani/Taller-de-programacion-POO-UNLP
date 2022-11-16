/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.*;
/**
 *
 * @author nedas
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona p1= new Persona();
        Persona vector []=new Persona[15];
        
        int i=0;
        GeneradorAleatorio.iniciar();
        int edad=GeneradorAleatorio.generarInt(99);
        while (edad!=0 && i<15){
            vector[i]=new Persona(GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(44000000),edad);
            edad=GeneradorAleatorio.generarInt(99);
            i++;
        }
        int cant=0;
        int minDni=44000001;
        for (int j=0;j<i;j++){
            if (vector[j].getEdad()>65){
                cant++;
            }
            if (vector[j].getDNI()<minDni){
                minDni=vector[j].getDNI();
            }
        }
        for (int j=0;j<i;j++){
            System.out.println(vector[j].toString());
        }
        System.out.println();
        System.out.println("Personas mayores que 65: "+ cant);
        System.out.println("La persona con el DNI mas chico: "+minDni);
    }
    
}
