/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

/**
 *
 * @author nedas
 */
public class Corista extends Persona {
    private int tonoFundamental;

    public Corista(int tonoFundamental, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        this.tonoFundamental = tonoFundamental;
    }

    public int getTonoFundamental() {
        return tonoFundamental;
    }
    
    
}
