package tema3;

public class Estante {
    private int dimF;
    private Libro libros[];
    private int dimL;
 

    public Estante(int dimF) {
        this.dimF = dimF;
        libros=new Libro[dimF];
        dimL=0;
    }

    public int devolverCantidadLibros() {
        return dimL;
    }
        
    public void agregarLibro(Libro libro){
        if (dimL<dimF){
            libros[dimL]=libro;
            dimL++;    
        }
    }

    public boolean estaLlenoElEstante(){
        return dimL==dimF;
    }
    
    public Libro devolverLibroPorTitulo(String titulo){
        int i=0;
        while (i<dimL && !libros[i].getTitulo().equals(titulo)){
            i++;
        }
        if (i<dimL){
            return libros[i];
        }else{
            return null;
        }
    }

}
