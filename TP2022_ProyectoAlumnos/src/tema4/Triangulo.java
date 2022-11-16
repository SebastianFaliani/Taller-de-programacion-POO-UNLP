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
public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double ladoA, double ladoB, double ladoC, String colorRelleno, String colorLinea) {
        super(colorRelleno,colorLinea);
        this.setLadoA(ladoA);
        this.setLadoB(ladoB);
        this.setLadoC(ladoC);
    }
    
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea(){
        double s=(this.getLadoA()+this.getLadoB()+this.getLadoC())/2;
        double area=Math.sqrt(s*(s-this.getLadoA())*(s-this.getLadoB())*(s-this.ladoC));
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        return this.getLadoA()+this.getLadoB()+this.getLadoC();
    }
    
    @Override
    public String toString(){
        return super.toString() + 
                " Lado A: " + this.getLadoA() + 
                " Lado B: " + this.getLadoC() + 
                " Lado C: " + this.getLadoC();
    }
}
