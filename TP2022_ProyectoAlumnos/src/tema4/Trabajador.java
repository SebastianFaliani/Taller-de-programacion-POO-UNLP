package tema4;

import tema2.Persona;

public class Trabajador extends Persona {
    private String tarea;

    public Trabajador(String unNombre, int unDNI, int unaEdad, String tarea) {
        super(unNombre, unDNI, unaEdad);
        this.setTarea(tarea);
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                " Soy: "+ this.getTarea();
    }
}
