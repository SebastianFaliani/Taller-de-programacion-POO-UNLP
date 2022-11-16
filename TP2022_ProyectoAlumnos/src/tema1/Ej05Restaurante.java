/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
    import PaqueteLectura.Lector;
/**
 *
 * @author nedas
 */
public class Ej05Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int fil=3;
        final int col=4;
        int matriz[][]=new int[fil][col];
        int i,j;
        for (i=0;i<fil;i++){
            System.out.println("CALIFIQUE ENTRE [1-10] los 4 Aspectos");
            for (j=0;j<col;j++){
                System.out.println("Ingrese Puntuacion: ");
                matriz[i][j]= Lector.leerInt();
            }
        }
        double promedio;
        for (j=0;j<col;j++){
            promedio=0;
            for (i=0;i<fil;i++){
                promedio=promedio+matriz[i][j];
            }
            System.out.println(promedio/fil);
                
        }
        
    }
    
}
