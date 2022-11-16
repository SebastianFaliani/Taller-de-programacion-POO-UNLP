/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3.Eje04;
import PaqueteLectura.GeneradorAleatorio;
import tema2.Persona;
/**
 *
 * @author nedas
 */
public class Hotel {
    private int dimF; //Cantidad de habitaciones
    private Habitacion habitaciones[];

    public Hotel(int dimF) {
        this.dimF = dimF;
        this.cargarHabitaciones(dimF);
    }
    
    private void cargarHabitaciones(int dimF){
        habitaciones=new Habitacion[dimF];
        GeneradorAleatorio.iniciar();
        for (int i=0; i<dimF;i++){
            habitaciones[i]=new Habitacion(GeneradorAleatorio.generarDouble(6000)+2001,"desocupada");
        }
    }
    
    public void ingresarCliente(Persona cliente, int habitacion){
        habitaciones[habitacion-1].setOcupada("ocupada");
        habitaciones[habitacion-1].setCliente(cliente);
    }
    
    public void aumentarCostoHabitaciones(double monto){
        for (int i=0; i<dimF;i++){
            habitaciones[i].aumentarCosto(monto);
        }
    }
    
    public void imprimirHabitaciones(){
        for (int i=0; i<dimF;i++){
            System.out.println("Habitacion "+ (int)(i+1)) ;
            System.out.println(habitaciones[i].toString());
        }
    }
    
}
