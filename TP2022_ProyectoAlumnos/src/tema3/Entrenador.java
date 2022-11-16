/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

public class Entrenador {
    private String nombre;
    private double sueldoBasico;
    private int antiguedad;
    private int campeonatos;

    public Entrenador() {
    }

    public Entrenador(String nombre, double sueldoBasico, int antiguedad, int campeonatos) {
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
        this.antiguedad = antiguedad;
        this.campeonatos = campeonatos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }
    
    public double calcularEfectividad(){
        return (100*campeonatos)/antiguedad;
    }

    private double montoAntiguedad(){
        return (antiguedad*0.1*sueldoBasico);
    }
    
    private double plusPorCampeonatos(){
        double plus=0;
        if (campeonatos>=1 && campeonatos<=4){
            plus=5000;
        }else if (campeonatos>=5 && campeonatos<=10){
            plus=30000;
        }else if (campeonatos>10){
            plus=50000;
        }
        return plus;
    }
    
    public double calcularSueldoACobrar(){
        return sueldoBasico+montoAntiguedad()+plusPorCampeonatos();
    }
}
