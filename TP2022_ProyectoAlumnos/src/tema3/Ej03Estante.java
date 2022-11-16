package tema3;

public class Ej03Estante {

    public static void main(String[] args) {
        Estante estante=new Estante(20);
        
        Autor autor=new Autor("Herbert Schildt","Desconocida","China");
        Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 autor, "978-0071809252", 21.72);
        Libro libro2= new Libro("Learning Java by Building Android Games",  
                              "CreateSpace Independent Publishing", 
                               autor, "978-1512108347");
        
        estante.agregarLibro(libro1);
        estante.agregarLibro(libro2);
        Libro libro3= estante.devolverLibroPorTitulo("Learning Java by Building Android Games");
        if (libro3!=(null)){
                System.out.println(libro3.toString());
            }else{
                System.out.println("No existe el libro");
            }
        
        System.out.println(estante.estaLlenoElEstante());
        System.out.println(estante.devolverCantidadLibros());
    }
    
}
