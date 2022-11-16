/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial3;

/**
 *
 * @author nedas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fecha fecha=new Fecha(2,4);
       
        Alumno a1 = new Alumno("Juan",604);
        fecha.agregarAlumno(a1,1);
        
        Alumno a2 = new Alumno("Sofia",287);
        fecha.agregarAlumno(a2,1);
        
        Alumno a3 = new Alumno("Mariangeles",407);
        fecha.agregarAlumno(a3,0);
        
        Alumno a4 = new Alumno("Lucas",324);
        fecha.agregarAlumno(a4,0);
        
        Alumno a5 = new Alumno("Luciano",285);
        fecha.agregarAlumno(a5,1);
        
        Alumno a6 = new Alumno("Natalia",923);
        fecha.agregarAlumno(a6,0);
        
        Alumno a7 = new Alumno("Sebastian",249);
        fecha.agregarAlumno(a7,0);
        
        fecha.asignarTema();
        
        fecha.imprime(3);
        
    }
    
}
