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
public class CoroPorHileras extends Coro {
    private int cantidadHileras;
    private int cantidadCoristasPorHileras;
    private Corista[][] coristas; 
    private int dimFil=0;
    private int dimCol=0;

    public CoroPorHileras(int cantidadHileras, int cantidadCoristasPorHileras, Director director) {
        super(director);
        this.cantidadHileras = cantidadHileras;
        this.cantidadCoristasPorHileras = cantidadCoristasPorHileras;
        this.coristas= new Corista[cantidadHileras][cantidadCoristasPorHileras];
        this.inicia();
    }

    public int getCantidadHileras() {
        return cantidadHileras;
    }

    public int getCantidadCoristasPorHileras() {
        return cantidadCoristasPorHileras;
    }
    
     private void inicia(){
        for(int i=0;i< this.getCantidadHileras();i++){
            for(int j=0;j< this.getCantidadCoristasPorHileras();j++){
                this.coristas[i][j]=null;
            }
        }
    }

    @Override
    public void agregarCorista(Corista corista) {
        if (this.dimFil<this.getCantidadHileras()){
            coristas[this.dimFil][this.dimCol]=corista;
            if (this.dimCol+1<this.getCantidadCoristasPorHileras()){
                this.dimCol++;
            }else{
                this.dimFil++;
                if (this.dimFil<this.getCantidadHileras()){
                    this.dimCol=0;
                }
            }
                
        }
        /*boolean encontrado=false;
        int i=0;
        int j=0;
        while (i<this.getCantidadHileras() && encontrado==false){
            j=0;
            while ((j<this.getCantidadCoristasPorHileras()-1)&& null!=coristas[i][j]){
                j++;
            }
            encontrado=(null==coristas[i][j]);
            i++;
        }
        if (encontrado){
            coristas[i-1][j]=corista;
            dimFil=i;
            dimCol=j+1;
        }*/
    }

    @Override
    public boolean estaLlenoElCoro() {
        return dimFil==this.getCantidadHileras() && dimCol==this.getCantidadCoristasPorHileras();
    }

    @Override
    public boolean estaBienFormadoElCoro() {
        if(this.estaLlenoElCoro()){
            int j=0,i=0;
            int tono=-1;
            boolean estado=true;
            while(i<dimFil && estado){
                j=0;
                if (tono>coristas[i][j].getTonoFundamental()){
                    estado=false;
                }
                tono=coristas[i][j].getTonoFundamental();
                while(j<dimCol && estado){
                    if (tono!=coristas[i][j].getTonoFundamental()){
                        estado=false;
                    }
                    j++;
                }
                i++;
            }
            return estado;
        }else{
            return false;
        }
            
    }
    
    @Override
    public String toString() {
        String aux=super.toString();
        for(int i=0;i<this.getCantidadHileras();i++){
            for(int j=0;j<this.getCantidadCoristasPorHileras();j++){
                aux+="\n" + this.coristas[i][j];
            }
        }
        return aux;
    }
}
