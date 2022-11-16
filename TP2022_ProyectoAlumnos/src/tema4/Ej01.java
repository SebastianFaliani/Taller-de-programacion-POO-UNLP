package tema4;

public class Ej01 {

    public static void main(String[] args) {
        Triangulo triangulo= new Triangulo(4,3,5,"rojo","blanco");
        Circulo circulo= new Circulo(6,"Azul","Amarillo");
        triangulo.despintar();
        System.out.println(triangulo.toString());
        System.out.println(circulo.toString());
    }
    
}
