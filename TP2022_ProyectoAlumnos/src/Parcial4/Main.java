/*
 4. Un psicólogo necesita un sistema para organizar su agenda semanal. El sistema mantiene para c/u de los 5 días de atención y 
c/u de los 6 turnos (horarios) del día, la información del paciente que tomó el turno. De los pacientes guarda: nombre, 
si tiene obra social y costo a abonar por la sesión.
a) Genere las clases necesarias. Implemente constructores para iniciar: el sistema sin pacientes; los pacientes a partir de toda
su información.
b) Lea atentamente y luego implemente métodos que permitan:
    - Agendar al paciente P en el primer día y turno libre. Retornar un string con el día y turno asignados. Asuma que hay un turno libre.
    -Dado un día D y turno T, liberar ese turno. Asuma que D y T son válidos.
    - Calcular y devolver el turno (es decir, horario) con más pacientes agendados.
c) Realice un programa que instancie el sistema. Cargue varios pacientes al sistema. Libere turnos agendados.
Para finalizar, imprima el resultado del inciso b.iii.
 */

package Parcial4;

/**
 *
 * @author nedas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda=new Agenda();
        
        
        
        System.out.println(agenda.agendarPaciente(new Paciente("sebas",true,125)));
        System.out.println(agenda.agendarPaciente(new Paciente("cris",true,245)));
        System.out.println(agenda.agendarPaciente(new Paciente("pri",false,215)));
        System.out.println(agenda.agendarPaciente(new Paciente("ekel",true,240)));
        System.out.println(agenda.agendarPaciente(new Paciente("yemi",true,153)));
        System.out.println(agenda.agendarPaciente(new Paciente("carlos",false,120)));
        System.out.println(agenda.agendarPaciente(new Paciente("bere",true,231)));
        System.out.println(agenda.agendarPaciente(new Paciente("ale",false,170)));
  
        //agenda.liberarTurno(1, 3);
        
        System.out.println(agenda.devolverTurno());


    }
    
}
