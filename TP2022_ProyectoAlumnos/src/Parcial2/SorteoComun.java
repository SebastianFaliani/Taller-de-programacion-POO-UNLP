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
public class SorteoComun extends Sorteo {

    public SorteoComun(double premio) {
        super(premio);
    }

    @Override
    public Persona devolverGanador() {
        Persona persona=this.devolverQuienCompro(GeneradorAleatorio.generarInt(99));
        while (persona==null){
            persona=this.devolverQuienCompro(GeneradorAleatorio.generarInt(99));
        }
        return persona;
    }
    
}
