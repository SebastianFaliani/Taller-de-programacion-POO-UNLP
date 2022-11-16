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
public abstract class Coro {
    private String nombreCoro;
    private Director director;

    public Coro(Director director) {
        this.director = director;
    }

    public String getNombreCoro() {
        return nombreCoro;
    }

    public void setNombreCoro(String nombreCoro) {
        this.nombreCoro = nombreCoro;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    public abstract void agregarCorista(Corista corista);
    
    public abstract boolean estaLlenoElCoro();
    
    public abstract boolean estaBienFormadoElCoro();

    @Override
    public String toString() {
        return nombreCoro + ", Director - " + director;
    }

}
