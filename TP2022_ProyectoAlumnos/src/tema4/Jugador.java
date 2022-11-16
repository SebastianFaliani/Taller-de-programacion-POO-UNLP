package tema4;

public class Jugador extends Empleado {
    private int partidosJugados;
    private int golesAnotados;

    public Jugador(int partidosJugados, int golesAnotados, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.setPartidosJugados(partidosJugados);
        this.setGolesAnotados(golesAnotados);
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }
    
    @Override
    public double calcularEfectividad(){
        return (double)this.getGolesAnotados()/this.getPartidosJugados();
    }
    
    @Override
    public double calcularSueldoACobrar(){
        double sueldo;
        if(this.calcularEfectividad()>0.5){
            sueldo=this.getSueldoBasico()+this.getSueldoConAntiguedad();
        }else{
            sueldo=this.getSueldoConAntiguedad();
        }
        return sueldo;
    }
    
}
