package Cuaderno_2.Ejercicio2_9;

public class main {
    public static void main(String[] args) {
        Mypoint v1= new Mypoint(2,3);
        Mypoint v2 = new Mypoint(6,5);
        Mypoint v3=new Mypoint(8,7); //Creo punto para probar un tipo de constructor
        MyTriangle t1= new MyTriangle(v1,v2,v3); //Constructor por puntos

        System.out.println(t1.getType());
        System.out.println("El perimetro del triangulo es: "+t1.getPerimeter());
        System.out.println(t1); //toString

        MyTriangle t2= new MyTriangle(1,2,6,3,7,5); //Constructor por coordenadas
        System.out.println(t2.getType());
        System.out.println("El perimetro del triangulo es: "+t2.getPerimeter());
        System.out.println(t2); //toString
    }
}
