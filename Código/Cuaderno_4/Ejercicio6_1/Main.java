package Cuaderno_4.Ejercicio6_1;

public class Main {
    public static void main(String[] args) {
        Shape1 s1 = new Circle(5.5, "red", false); //Polimorfismo
        System.out.println(s1);
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());El error se debe a que s1 es de tipo Shape y en esta clase no está definida ese método

        Circle c1 = (Circle)s1; // Polimorfismo para acceder a métodos específicos de Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape1 s2 = new Shape1(); En una clase abstract no puedes crear un objeto ya que es una subclase base

        Shape1 s3 = new Rectangle(1.0, 2.0, "red", false); // Polimorfismo
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); El error se debe a que s3 es de tipo Shape y en esta clase no está definida ese método

        Rectangle r1 = (Rectangle)s3; // Polimorfismo para acceder a métodos específicos de rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape1 s4 = new Square(6.6); // Polimorfismo para acceder a métodos específicos de Square
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());El error se debe a que s4 es de tipo Shape y en esta clase no está definida ese método


        Rectangle r2 = (Rectangle)s4;//Polimorfismo para acceder a métodos específicos de Square
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());El error a que el método getSide no esta definido en Rectangle, correctamente abajo.
        System.out.println(r2.getLength());


        Square sq1 = (Square)r2;//Polimorfismo
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        //Explicación sobre clases abstractas y métodos abstractos en teoría
    }
}
