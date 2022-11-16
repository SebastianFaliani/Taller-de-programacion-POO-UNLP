/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author nedas
 */
public class Investigador {
    private String nombreCompleto;
    private int categoria;
    private String especialidad;
    private Subsidio[] subsidios= new Subsidio[5];
    private int dimL=0;

    public Investigador(String nombreCompleto, int categoria, String especialidad) {
        this.nombreCompleto = nombreCompleto;
        this.categoria=categoria;
        this.especialidad = especialidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void agregarSubsidio(Subsidio unSubsidio){
        if(dimL<5){
            this.subsidios[dimL]=unSubsidio;
            this.dimL++;
        }
    }
    
    public double dineroTotalOtorgado(){
        double monto=0;
        for(int i=0;i<dimL;i++){
            if(this.subsidios[i].isOtorgado())
                monto+= this.subsidios[i].getMontoPedido();
        }
        return monto;
    }
    
    public void otorgarTodos(){
        for(int i=0;i<dimL;i++){
            if(!this.subsidios[i].isOtorgado()){
                this.subsidios[i].setOtorgado(true);
            }
        }
    }
    
    @Override
    public String toString(){
        return this.getNombreCompleto() +
                " " + this.getCategoria() + 
                " " + this.getEspecialidad() +
                " " + this.dineroTotalOtorgado();
    }
    
}
