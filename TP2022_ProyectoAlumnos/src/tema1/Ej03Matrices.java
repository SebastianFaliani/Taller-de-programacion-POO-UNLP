/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej03Matrices {

    public static void main(String[] args) {
	//Paso 2. iniciar el generador aleatorio     
	 GeneradorAleatorio.iniciar();
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
        final int dimF=5;
        final int dimC=5;
        int [][] matriz =new int [dimF][dimC];
        int i,j;
        for(i=0;i<dimF;i++){
            for(j=0;j<dimC;j++){
                matriz[i][j]=GeneradorAleatorio.generarInt(100);
            }
        }
        //Paso 4. mostrar el contenido de la matriz en consola
        for(i=0;i<dimF;i++){
            for(j=0;j<dimC;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }    
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        int suma=0;
        for(j=0;j<dimC;j++){
            suma=suma+ matriz[0][j];
        }
        System.out.println();
        System.out.println("Suma de la primer Fila");
        System.out.println(suma);
    
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
        int [] vector=new int[dimF];
        for (j=0;j<dimC;j++){
            suma=0;
            for(i=0;i<dimF;i++){
                suma=suma+matriz[i][j];
            }
            vector[j]=suma;
        }
        System.out.println();
        System.out.println("Vector de suma de columnas");
        for(j=0;j<dimC;j++){
            System.out.print(vector[j]+" ");
        }
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        System.out.println();
        System.out.print("Ingrese un valor a buscar: ");
        int valor=Lector.leerInt();
        boolean encontrado=false;
        i=0;
        while ((i<dimF)&&(encontrado==false)){
            j=0;
            while ((j<dimC-1)&&(valor!=matriz[i][j])){
                j++;
            }
            encontrado=(valor==matriz[i][j]);
            i++;
        }
        if (encontrado){
            System.out.println("Fila: "+(i-1)+" Columna:"+j);
        }else{
            System.out.println("No se encontró el elemento");
        }
    }
}
