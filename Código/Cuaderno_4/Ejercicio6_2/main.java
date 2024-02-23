package Cuaderno_4.Ejercicio6_2;

public class main {

    public static void main(String[] args){
        GeometricObject o1= new Rectangle(2,5);
        GeometricObject o2=new Circle(2);
        System.out.println("El perimetro del rectangulo es: "+ o1.getPerimeter());
        System.out.println("El Area del rectangulo es: "+ o1.getArea());
        System.out.println("El perimetro del circulo es: "+ o2.getPerimeter());
        System.out.println("El Area del circulo es: "+ o2.getArea());
    }
}
