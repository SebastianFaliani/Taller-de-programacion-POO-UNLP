package tema4;

import java.time.LocalDate;

public class Micro {
    private int dimF=20;
    private String patente;
    private String destino;
    private LocalDate horaSalida;
    private boolean[] asientos;
    private int asientosOcupados;

    public Micro(String patente, String destino, LocalDate horaSalida, int asientosLibres) {
        this.patente = patente;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientos=new boolean[dimF];
        this.asientosOcupados=this.dimF - asientosLibres;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDate horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public boolean getMicroLleno(){
        return dimF==this.getAsientosOcupados();
    }
    
    public String validarAsiento(int asiento){
        if(asiento>0 && asiento<=dimF)
            return "Si";
        else
            return "No";
    }
    
    public boolean getEstadoAsiento(int asiento){
        return this.asientos[asiento-1];
    }
    
}
