package tema4;

public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;
    private int antiguedad;

    public Empleado(String nombre, double sueldoBasico, int antiguedad) {
        this.setNombre(nombre);
        this.setSueldoBasico(sueldoBasico);
        this.setAntiguedad(antiguedad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public double getSueldoConAntiguedad(){
        return this.getSueldoBasico()+(this.getSueldoBasico()*(this.getAntiguedad()*10))/100;
    }
    
    public abstract double calcularEfectividad();
    public abstract double calcularSueldoACobrar();
    
    @Override
    public String toString(){
        return "Nombre: " + this.getNombre()+
                " Sueldo: " + this.calcularSueldoACobrar() +
                " Efectividad: " + this.calcularEfectividad();
    }
    
}
