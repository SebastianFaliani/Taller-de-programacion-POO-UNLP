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
public class Alumno {
    private String nombre;
    private int dni;
    private int tema;

    public Alumno(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.tema = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ this.getNombre() +
                " DNI: " + this.getDni() +
                " Tema: " + this.getTema();
    }
}
