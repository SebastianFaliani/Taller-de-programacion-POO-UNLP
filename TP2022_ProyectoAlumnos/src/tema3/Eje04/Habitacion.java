
package tema3.Eje04;
import tema2.Persona;


public class Habitacion {
    private double costo;
    private String ocupada;
    private Persona cliente;

    public Habitacion() {
    }

    public Habitacion(double costo, String ocupada) {
        this.costo = costo;
        this.ocupada = ocupada;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getOcupada() {
        return ocupada;
    }

    public void setOcupada(String ocupada) {
        this.ocupada = ocupada;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    
    public void aumentarCosto(double monto){
        costo+=monto;
    }
    
    @Override
    public String toString(){
        String imprime;
        imprime=("Precio: "+costo+" - "+ocupada);
        if (ocupada.equals("ocupada")){
            imprime=imprime+" "+cliente.toString();
        }
        return imprime;
    }
}
