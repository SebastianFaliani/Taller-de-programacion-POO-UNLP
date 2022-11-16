/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author nedas
 */
public class VisorFigurasModificado {
    private int guardadas;
    private int capacidadMaxima=5;
    private Figura [] vector;
 
    public VisorFigurasModificado(){
        this.vector=new Figura[this.capacidadMaxima];
        this.guardadas=0;
    }

    public void guardar(Figura f){
        if(this.getGuardadas()<this.capacidadMaxima){
            vector[this.getGuardadas()]=f;
            this.guardadas++;
        }
    }
    public boolean quedaEspacio(){
        return this.getGuardadas()<this.capacidadMaxima;
    }

    public void mostrar(){
        for(int i=0;i<this.getGuardadas();i++){
            System.out.println(this.vector[i]);
        }
    }

    public int getGuardadas() {
        return guardadas;
    }

}
