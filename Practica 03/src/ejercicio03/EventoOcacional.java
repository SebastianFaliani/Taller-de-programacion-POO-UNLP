/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author nedas
 */
public class EventoOcacional extends Recital {
    private String motivo;
    private String nombreContratante;
    private int diaEvento;

    public EventoOcacional(String motivo, String nombreContratante, int diaEvento, String nombreBanda, int cantidadTemas) {
        super(nombreBanda, cantidadTemas);
        this.motivo = motivo;
        this.nombreContratante = nombreContratante;
        this.diaEvento = diaEvento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNombreContratante() {
        return nombreContratante;
    }

    public void setNombreContratante(String nombreContratante) {
        this.nombreContratante = nombreContratante;
    }

    public int getDiaEvento() {
        return diaEvento;
    }

    public void setDiaEvento(int diaEvento) {
        this.diaEvento = diaEvento;
    }
    
    @Override
    public String actuar(){
        String aux="";
        if(this.getMotivo().equals("a beneficio")){
            aux= "Recuerden colaborar con " + this.getNombreContratante();
        }else if(this.getMotivo().equals("show de TV")){
            aux= "Saludos amigos televidentes ";
        }else if(this.getMotivo().equals("show privado")){
            aux= "Un feliz cumpleaños para " + this.getNombreContratante();
        }
        
        aux+= "\n" + super.actuar();
        return aux;
    }

    @Override
    public double calcularCosto() {
        double monto=0;
        if(this.getMotivo().equals("a beneficio")){
            monto=0;
        }else if(this.getMotivo().equals("show de TV")){
            monto=50000;
        }else if(this.getMotivo().equals("show privado")){
            monto=150000;
        }
        return monto;
    }
}
