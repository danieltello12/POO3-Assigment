package Cuaderno_2.Ejercicio2_8;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        Mycircle c1 = new Mycircle(); // Test constructor
        System.out.println(c1); // Test toString()
        c1.setCenterX(8); // Test setters
        c1.setCenterY(6);
        System.out.println("x centro is: " + c1.getCenterX()); // Test getters
        System.out.println("y centro is: " + c1.getCentery());
        System.out.println("el radio es: "+ c1.getRadio());
        Mycircle circulo=new Mycircle(1,2,5);//test otro constructor
        System.out.println("el centro es: "+circulo.getCentro());
        c1.setRadio(5);
        System.out.println(("El nuevo radio es: ")+c1.getRadio());
        circulo.setCenterXY(5,5);
        System.out.println("EL nuevo centro(con coordenadas) es:"+circulo.getCentro());
        Mypoint centronuevo= new Mypoint(2,5);
        circulo.setCentro(centronuevo);
        System.out.println("El nuevo centro(punto) es: "+ circulo.getCentro());
        c1.setCenterXY(3, 0); // Test setXY()
        System.out.println(c1.getXY()[0]); // Test getXY()
        System.out.println(c1.getXY()[1]);
        System.out.println(c1);
        Mypoint centro= new Mypoint(3,4); // Test another constructor
        Mycircle c2= new Mycircle(centro,4);
        System.out.println(c2);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
// Testing the overloaded methods distance()
        System.out.println(c1.distancia(c2)); // which version?
        System.out.println(c2.distancia(c1)); // which version?
    }
}
