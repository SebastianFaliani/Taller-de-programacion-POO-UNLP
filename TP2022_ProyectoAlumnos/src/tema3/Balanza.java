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
public class Balanza {
    private double monto;
    private int cantidad;

    public Balanza() {
    }

    public double getMonto() {
        return monto;
    }

    public void iniciarCompra(){
        monto=0;
        cantidad=0;
    }
    
    public void registrarProductos(double pesoEnKg, double precioPorKg){
        cantidad++;
        monto=monto+(pesoEnKg*precioPorKg);
    }

    public String getResumenDeCompra(){
        return "Total a pagar "+ monto + " por la compra de "+ cantidad +" productos";
    }
}
