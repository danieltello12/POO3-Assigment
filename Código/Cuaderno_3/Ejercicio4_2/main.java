package Cuaderno_3.Ejercicio4_2;

public class main {
    public static void main (String[] args) {
        Cylinder c1= new Cylinder(1,4);
        System.out.println("Cylinder:"
                + " radius=" + c1.getBase().getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getBase().getArea()
                + " volume=" + c1.getVolumen());
        Cylinder c2= new Cylinder(3,8,"Azul");
        System.out.println("Cylinder:"
                + " radius=" + c2.getBase().getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getBase().getArea()
                + " volume=" + c2.getVolumen());
        Circle base= new Circle(9,"verde");
        Cylinder c3= new Cylinder(base,90);
        System.out.println("Cylinder:"
                + " radius=" + c3.getBase().getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getBase().getArea()
                + " volume=" + c3.getVolumen());


    }

    }
