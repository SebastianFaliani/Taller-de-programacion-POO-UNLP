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
public class Ej05Partido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int F=20;
        Partido vector[]=new Partido[F];
        String local;
        String visitante;
        int golesLocal; 
        int golesVisitante;
        int i=0;

        System.out.print("Visitante: ");
        visitante=Lector.leerString();
        while(i<F && !visitante.equals("ZZZ")){
            vector[i]=new Partido();
            System.out.print("Local: ");
            vector[i].setLocal(Lector.leerString());
            vector[i].setVisitante(visitante);
            System.out.print("Goles Local: ");
            vector[i].setGolesLocal(Lector.leerInt());
            System.out.print("Goles Visitante: ");
            vector[i].setGolesVisitante(Lector.leerInt());
            //vector[i]=new Partido(local,visitante,golesLocal,golesVisitante);
            System.out.print("Visitante: ");
            visitante=Lector.leerString();
            i++;
        }
        int RiverGan=0;
        int GolesBocaLocal=0;
        System.out.println();
        for(int x=0;x<i;x++){
            System.out.println(vector[x].getLocal()+" "+ vector[x].getGolesLocal()+" VS "+vector[x].getVisitante()+" "+vector[x].getGolesVisitante());
            if(vector[x].getGanador().equals("River")){
                RiverGan++;
            }
            if(vector[x].getLocal().equals("Boca")){
                GolesBocaLocal=GolesBocaLocal+vector[x].getGolesLocal();
            }
        }
        System.out.println();
        System.out.println("Partidos ganador por River: "+RiverGan);
        System.out.println("Total de goles Boca de Local: "+GolesBocaLocal);
    }
    
}
