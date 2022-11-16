/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author nedas
 */
public class Gira extends Recital {
    private String nombreGira;
    private FechaRecital[] fechasRecital;
    private int cantidadFechas;
    private int fechaActual;
    private int dimL=0;

    public Gira(String nombreGira, int cantidadFechas, String nombreBanda, int cantidadTemas) {
        super(nombreBanda, cantidadTemas);
        this.nombreGira = nombreGira;
        this.cantidadFechas = cantidadFechas;
        this.fechasRecital= new FechaRecital[cantidadFechas];
    }

    public String getNombreGira() {
        return nombreGira;
    }

    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }

    public int getCantidadFechas() {
        return cantidadFechas;
    }

    public void setCantidadFechas(int cantidadFechas) {
        this.cantidadFechas = cantidadFechas;
    }

    public int getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(int fechaActual) {
        this.fechaActual = fechaActual;
    }
    
    public void agregarFecha(FechaRecital fechaRecital){
        if(this.dimL<this.getCantidadFechas()){
            this.fechasRecital[dimL]=fechaRecital;
            dimL++;
        }
    }
    
    @Override
    public String actuar(){
        String aux="";
        aux= ("Buenas noches " + fechasRecital[this.getFechaActual()].getCiudad() + "\n" +
                super.actuar());
        
        if(this.getFechaActual()<this.getCantidadFechas()){
            this.setFechaActual(this.getFechaActual()+1);
        }
        return aux;
    }
    
    @Override
    public double calcularCosto() {
        return this.getCantidadFechas()*30000;
    }
}
