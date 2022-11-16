/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author nedas
 */
public class Producto {
    private String descripcion;
    private double pesoEnKg;

    public Producto() {
    }

    public Producto(String descripcion, double pesoEnKg) {
        this.descripcion = descripcion;
        this.pesoEnKg = pesoEnKg;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPesoEnKg() {
        return pesoEnKg;
    }

    public void setPesoEnKg(double pesoEnKg) {
        this.pesoEnKg = pesoEnKg;
    }
    
    
}
