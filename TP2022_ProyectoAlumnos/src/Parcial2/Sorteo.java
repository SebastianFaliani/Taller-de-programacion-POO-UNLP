/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author nedas
 */
public abstract class Sorteo {
    private double premio;
    private Persona[] bonos;
    
    private void iniciarBonos(){
        for(int i=0;i<99;i++){
            bonos[i]=null;
        }
    }
    
    public Sorteo(double premio) {
        this.premio = premio;
        this.bonos=new Persona[99];
        //this.iniciarBonos();
        GeneradorAleatorio.iniciar();
    }

    public int agregarPersona(Persona persona){
        int num=GeneradorAleatorio.generarInt(99);
        while(bonos[num]!=null){
            num=GeneradorAleatorio.generarInt(99);
        }
        bonos[num]=persona;
        return num;
    }
    
    public Persona devolverQuienCompro(int num){
        return bonos[num];
    }
    
    public abstract Persona devolverGanador();
    
    @Override
    public String toString(){
        return "Ganador" + this.toString();
    }
    
}
