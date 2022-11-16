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
public class CoroSemicircular extends Coro{
    private int cantidadCoristas;
    private Corista[] coristas;
    private int dimL=0;

    public CoroSemicircular(int cantidadCoristas, Director director) {
        super(director);
        this.cantidadCoristas = cantidadCoristas;
        this.coristas= new Corista[cantidadCoristas];
        this.inicia();
    }

    public int getCantidadCoristas() {
        return cantidadCoristas;
    }
    
    private void inicia(){
        for(int i=0;i< this.getCantidadCoristas();i++){
            this.coristas[i]=null;
        }
    }

    @Override
    public void agregarCorista(Corista corista) {
        if(dimL<this.getCantidadCoristas()){
            this.coristas[dimL]=corista;
            dimL++;    
        }
    }

    @Override
    public boolean estaLlenoElCoro() {
        return dimL==this.getCantidadCoristas();
    }

    @Override
    public boolean estaBienFormadoElCoro() {
        int i=0;
        int tono=-1;
        boolean estado=true;
        while(i<this.dimL && estado){
            if (this.coristas[i].getTonoFundamental()>=tono){
                tono= this.coristas[i].getTonoFundamental();
                i++;
            }else{
                estado=false;
            }
        }
        return estado;
    }
    
    @Override
    public String toString() {
        String aux=super.toString();
        for(int i=0;i<dimL;i++){
            aux+="\n" + this.coristas[i];
        }
        return aux;
    }
}
