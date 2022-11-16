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
public abstract class Recital {
    private String nombreBanda;
    private int cantidadTemas;
    private String listaTemas[];
    private int dimL=0;
    private int temaActual=0;

    public Recital(String nombreBanda, int cantidadTemas) {
        this.nombreBanda = nombreBanda;
        this.cantidadTemas = cantidadTemas;
        this.listaTemas= new String[cantidadTemas];
    }
 
    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public int getCantidadTemas() {
        return cantidadTemas;
    }

    public void agregarTema(String tema){
        if (dimL<this.getCantidadTemas()){
            listaTemas[dimL]=tema;
            dimL++;
        }
    }
    
    public String actuar(){
        String aux="";
        //if (this.temaActual<=this.dimL)
        for(int i=0;i<this.dimL;i++){
            aux+= "\n" + listaTemas[i];
            //this.temaActual++;
        }
        return "Y ahora tocaremos " + aux;
    }
    
    public abstract double calcularCosto();
    
}
