/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

/**
 *
 * @author nedas
 */
public class SorteoAvanzado extends Sorteo{

    public SorteoAvanzado(double premio) {
        super(premio);
    }
    
    private Persona buscarMaximo(Persona persona, Persona personaMax){
        if(persona.getColaboracion()>personaMax.getColaboracion()){
            personaMax=persona;
        }
        return personaMax;
    }

    @Override
    public Persona devolverGanador() {
        Persona personaMax=new Persona("",0,-1);
        Persona persona;
        for(int i=0;i<99;i++){
            persona=this.devolverQuienCompro(i);
            if (persona!=null){
                personaMax=this.buscarMaximo(persona, personaMax);
            }
        }
        return personaMax;
    }

}
