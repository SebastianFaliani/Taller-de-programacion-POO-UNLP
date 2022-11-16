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
public class Fecha {
    private int salaN;
    private int alumnoM;
    private Sala[] sala;
    //private int dimL;

    public Fecha(int N, int M) {
        this.salaN = N;
        this.alumnoM = M;
        sala=new Sala[this.getSalaN()];
        this.iniciarSalas();
    }
    
    private void iniciarSalas(){
        for(int i=0;i<this.getSalaN();i++){
            sala[i]=new Sala(this.getAlumnoM());
        }
    }

    public int getSalaN() {
        return salaN;
    }

    public int getAlumnoM() {
        return alumnoM;
    }
    
    public void agregarAlumno(Alumno alumno,int sala){
        this.sala[sala].agregarAlumno(alumno);
    }
    
    public void asignarTema(){
        for(int i=0;i<this.getSalaN();i++){
            this.sala[i].asignarTema();
        }
    }
    
    public void imprime(int tema){
        for(int i=0;i<this.getSalaN();i++){
            this.sala[i].devAlumno(tema);
        }
        
    }
    
    
}
