package tema4;

public class Entrenador extends Empleado {
    private int cantidadCampeonatosGanados;

    public Entrenador(int cantidadCampeonatosGanados, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.setCantidadCampeonatosGanados(cantidadCampeonatosGanados);
    }

    public int getCantidadCampeonatosGanados() {
        return cantidadCampeonatosGanados;
    }

    public void setCantidadCampeonatosGanados(int cantidadCampeonatosGanados) {
        this.cantidadCampeonatosGanados = cantidadCampeonatosGanados;
    }

    @Override
    public double calcularEfectividad() {
        return (double)this.getCantidadCampeonatosGanados()/this.getAntiguedad();
    }

    @Override
    public double calcularSueldoACobrar() {
        double sueldo;
        if(this.getCantidadCampeonatosGanados()>=1 && this.getCantidadCampeonatosGanados()<=4){
            sueldo=5000;
        }else if(this.getCantidadCampeonatosGanados()>=5 && this.getCantidadCampeonatosGanados()<=10){
            sueldo=30000;
        }else{
            sueldo=50000;
        }
        return this.getSueldoConAntiguedad()+sueldo;
    }
    
    
}
