/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author nedas
 */
public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private String colorRelleno;
    private String colorLinea;

    public Triangulo() {
        
    }

    public Triangulo(double ladoA, double ladoB, double ladoC, String colorRelleno, String colorLinea) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
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

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    
    public double calcularArea(){
        double s=(ladoA+ladoB+ladoC)/2;
        double area=Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
        return area;
    }
    
    public double calcularPerimetro(){
        return ladoA+ladoB+ladoC;
    }
}
