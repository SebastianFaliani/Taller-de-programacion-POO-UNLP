/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial4;

/**
 *
 * @author nedas
 */
public class Agenda {
    private Paciente[][] paciente=new Paciente[5][6];

    public Agenda() {
        
    }
    
    private void inicializar(){
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                paciente[i][j]=null;
            }
        }
    }
    
    public String agendarPaciente(Paciente P){
        int i=0;
        int j=0;
        boolean agrego=false;
        while(i<5 && !agrego){
            j=0;
            while (j<6 && !agrego){
                if (paciente[i][j]==null ){
                    agrego=true;
                    paciente[i][j]=P;
                }
                j++;
            }
            i++;
        }
        return "Dia: "+ i + " Horario: " + j;
    }
    
    public void liberarTurno(int D, int T){
        paciente[D-1][T-1]=null;
    }
    
    private int maximo(int cantTurno, int cantTurnoMax){
        if(cantTurno>cantTurnoMax){
            cantTurnoMax=cantTurno;
        }
        return cantTurnoMax;
    }
    
    public int devolverTurno(){
        int turno=0;
        int j=0;
        int cantTurnoMax=-1;
        for(int i=0;i<5;i++){
            int cantTurno=0;
            for(j=0;j<6;j++){
                if(paciente[i][j]!=null){
                    cantTurno++;
                }
            }
            if(cantTurno>cantTurnoMax){
                cantTurnoMax=cantTurno;
                turno=i+1;
            }
            
        }
        return turno;
    }
    
    public void imprime(){
        int i=0;
        int j=0;
        while(i<5 ){
            j=0;
            while (j<6 ){
               System.out.println(paciente[i][j]);
                j++;
            }
            i++;
        }
    }
    
}
