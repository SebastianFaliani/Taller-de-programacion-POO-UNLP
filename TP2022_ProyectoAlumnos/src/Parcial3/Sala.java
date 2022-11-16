/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial3;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author nedas
 */
public class Sala {
    private int alumnoM;
    private Alumno[] alumno;
    private int dimL;

    public Sala(int M) {
        this.alumnoM = M;
        alumno=new Alumno[M];
    }
    
    public void agregarAlumno(Alumno alumno){
        this.alumno[dimL]=alumno;
        dimL++;
    }
    
    public void asignarTema(){
        GeneradorAleatorio.iniciar();
        for(int i=0;i<dimL;i++){
            this.alumno[i].setTema(GeneradorAleatorio.generarInt(this.alumnoM)+1);   
        }
    }
    
    public void devAlumno(int tema){
        for(int i=0;i<dimL;i++){
            if (this.alumno[i].getTema()==tema){
                System.out.println(this.alumno[i].toString());       
            }
        }
        
    }
    
    
}
