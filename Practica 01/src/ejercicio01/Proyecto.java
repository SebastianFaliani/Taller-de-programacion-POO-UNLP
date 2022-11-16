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
public class Proyecto {
    private String nombre;
    private int codigo;
    private String nombreCompletoDirector;
    private Investigador[] investigadores=new Investigador[20];
    private int dimL=0;

    public Proyecto(String nombre, int codigo, String nombreCompletoDirector) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nombreCompletoDirector = nombreCompletoDirector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCompletoDirector() {
        return nombreCompletoDirector;
    }

    public void setNombreCompletoDirector(String nombreCompletoDirector) {
        this.nombreCompletoDirector = nombreCompletoDirector;
    }
    
        public void agregarInvestigador(Investigador unInvestigador){
        if (dimL<20){
            this.investigadores[dimL]=unInvestigador;
            this.dimL++;
        }
    }
    
    public double dineroTotalOtorgado(){
        double monto=0;
        for(int i=0;i<dimL;i++){
            monto+=this.investigadores[i].dineroTotalOtorgado();
        }
        return monto;
    }
    
    public void otorgarTodos(String nombre_completo){
        int i=0;
        while (i<dimL && !this.investigadores[i].getNombreCompleto().equals(nombre_completo)){
            i++;
        }
        if (i<=dimL){
            this.investigadores[i].otorgarTodos();
        }
    }
    
    @Override
    public String toString(){
        String aux="";
        for(int i=0;i<dimL;i++){
            aux+="\n    " + this.investigadores[i] ;
        }
        return this.getNombre() + 
                " " + this.getCodigo() +
                " " + this.getNombreCompletoDirector() +
                " " + this.dineroTotalOtorgado() +
                " " + aux;
    }
    
}
