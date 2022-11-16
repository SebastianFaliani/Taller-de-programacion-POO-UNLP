/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
    import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author nedas
 */
public class Ej04Edificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int fil=8;
        final int col=4;
        int matriz[][]=new int[fil][col];
        GeneradorAleatorio.iniciar();
        int i= GeneradorAleatorio.generarInt(8)+1;
        int j= GeneradorAleatorio.generarInt(3)+1;
        System.out.println("Ingresos [Piso,Oficina]");
        while(i!=9){
            System.out.print("["+i+","+j+"] ");
            matriz[i-1][j-1]=matriz[i-1][j-1] +1;
            i= GeneradorAleatorio.generarInt(9)+1;
            j= GeneradorAleatorio.generarInt(3)+1;
            
        }
        System.out.println();
        System.out.println();
        System.out.println("Total por oficinas");
        for(i=0;i<fil;i++){
            System.out.print("[Piso "+(i+1)+"] ");
            for(j=0;j<col;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
             
        
        
    }
    
}
