package tema3.Eje04;

import tema2.Persona;


public class Ej04Pra03 {

    public static void main(String[] args) {
        Hotel hotel=new Hotel(5);
       
        hotel.ingresarCliente(new Persona("Sebas",24999458,46), 2);
        hotel.ingresarCliente(new Persona("Priscila",4225000,22), 4);
        hotel.imprimirHabitaciones();
        hotel.aumentarCostoHabitaciones(1000);
        System.out.println();
        hotel.imprimirHabitaciones();
    }
}
