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
public class Ej04Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int F=5;
        final int C=8;
        Persona matriz[][]= new Persona[F][C];
        String nombre;
        int i=0,j=0;
        GeneradorAleatorio.iniciar();
        nombre=GeneradorAleatorio.generarString(3);
        while(i<F && !nombre.equals("zzz")){
            j=0;
            while(j<C && !nombre.equals("zzz")){
                matriz[i][j]=new Persona(nombre,GeneradorAleatorio.generarInt(44000000),GeneradorAleatorio.generarInt(99));
                nombre=GeneradorAleatorio.generarString(3);
                j++;
            }
            i++;
        }
        for(int x=0;x<i;x++){
            for(int y=0;y<j;y++){
                System.out.print(matriz[x][y].getNombre()+" - ");
            }
            System.out.println();
        }
    }
    
}
