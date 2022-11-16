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
public class BalanzaEj05 {
    private double monto;
    private int cantidad;
    private String resumen;

    public BalanzaEj05() {
    }

    public double getMonto() {
        return monto;
    }

    public void iniciarCompra(){
        monto=0;
        cantidad=0;
        resumen="";
    }
    
    public void registrarProductos(Producto producto, double precioPorKg){
        cantidad++;
        double precio=(producto.getPesoEnKg()*precioPorKg);
        resumen=resumen + producto.getDescripcion()+" "+precio+ "$ - ";
        monto=monto+precio;
    }

    public String getResumenDeCompra(){
        return resumen + "Total a pagar "+ monto + " por la compra de "+ cantidad +" productos";
    }
}
