
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        
        //Paso 2: Declarar la variable vector de double 
        int dimF=5;
        double [] jugadores;
        
        //Paso 3: Crear el vector para 15 double 
        jugadores=new double[dimF];
        
        //Paso 4: Declarar indice y variables auxiliares a usar
        double alturaPromedio;
        int cantPorEncimaAlturaPromedio,i;
        
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (i=0;i<dimF;i++){
            System.out.println("Ingrese la altura: ");
            jugadores[i]=Lector.leerDouble();
        }
        
        //Paso 7: Calcular el promedio de alturas, informarlo
        alturaPromedio=0;
        for(i=0;i<dimF;i++){
            alturaPromedio=alturaPromedio+jugadores[i];
        }
        alturaPromedio=alturaPromedio/dimF;
        System.out.println();
        System.out.println("La altura promedio es: " + alturaPromedio);
        
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        cantPorEncimaAlturaPromedio=0;
        for (i=0;i<dimF;i++){
            if (jugadores[i]>alturaPromedio){
                cantPorEncimaAlturaPromedio=cantPorEncimaAlturaPromedio+1;
            }
        }
        
        //Paso 9: Informar la cantidad.
        System.out.println("Los que sobrepasan la altura promedio son: " + cantPorEncimaAlturaPromedio);
    }
    
}
