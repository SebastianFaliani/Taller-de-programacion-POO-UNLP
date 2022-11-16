/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author nedas
 */
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private String horaApertura;
    private String horaCierre;
    private int piso;
    private int plaza;
    private Auto[][] ubicacion;

    public Estacionamiento(String nombre, String direccion, int piso, int plaza) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = "8:00";
        this.horaCierre = "21:00";
        this.piso = piso;
        this.plaza = plaza;
        this.inicializarUbicacion();
    }

    public Estacionamiento(String nombre, String direccion, String horaApertura, String horaCierre, int piso, int plaza) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.piso = piso;
        this.plaza = plaza;
        this.inicializarUbicacion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public int getPiso() {
        return piso;
    }

    public int getPlaza() {
        return plaza;
    }

    private void inicializarUbicacion(){
        ubicacion=new Auto[piso][plaza];
        for(int i=0;i<this.getPiso();i++){
            for(int j=0; j<this.getPlaza();j++){
                ubicacion[i][j]=null;
            }
        }
    }
    
    public void registrarAuto(Auto auto,int piso, int plaza){
        if (piso<=this.getPiso() && plaza <= this.getPlaza()){
            this.ubicacion [piso-1][plaza-1]=auto;
        }
    }
    
    public String buscarAuto(String patente){
        int i=0;
        int j=0;
        boolean encontrado=false;
        while(i<this.getPiso() && !encontrado){
            j=0;
            while(j<this.getPlaza() && ((this.ubicacion[i][j]==null)|| !this.ubicacion[i][j].getPatente().equals(patente))){
                j++;
            }
            if (j==this.getPlaza() || (this.ubicacion[i][j]==null)){
                i++;
            }else{
                encontrado=this.ubicacion[i][j].getPatente().equals(patente);
            }
        }
        if(i<this.getPiso()){
            return "Piso: " + (i+1) + " Plaza " + (j+1);
        }else{
            return "“Auto Inexistente";
        }
    }
    
    public int cantidadAutosPorPlaza(int plaza){
        int cont=0;
        if(plaza>0 && plaza< this.getPlaza()){
            for(int i=0;i<this.getPiso();i++){
                if (ubicacion[i][plaza-1]!=null){
                    cont++;
                }
            }
        }
        return cont;
    }

    @Override
    public String toString() {
        String aux="";
        for(int i=0;i<this.getPiso();i++){
            for(int j=0; j<this.getPlaza();j++){
                aux+="Piso " + (i+1) + " Plaza " + (j+1);
                if (ubicacion[i][j]==null){
                    aux+=" libre \n";
                }else{
                    aux+=" " +  ubicacion[i][j] + "\n";
                }
            }
        }
        return aux;
    }
   
    
}
