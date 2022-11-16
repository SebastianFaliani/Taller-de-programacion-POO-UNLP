package tema4;

import tema2.Persona;

public class Ej03 {

    public static void main(String[] args) {
        Persona persona=new Persona("Cristina",26946420,44);
        Trabajador trabajador=new Trabajador("Sebastian",24999458,46,"Programador");
        
        System.out.println(persona);
        System.out.println(trabajador);
    }
    
}
