package Cuaderno_3.Ejercicio3_5;

public class Main {
    public static void main(String[] args) {
        //Círculo
        Circle miObjeto1=new Circle(3,"blue",false);
        System.out.println("Está lleno?"+miObjeto1.isFilled());
        System.out.println("El radio del círculo es: "+miObjeto1.getRadius());
        System.out.println("El área del círculo es: "+miObjeto1.getArea());
        System.out.println("El perímetro del círculo es: "+miObjeto1.getPerimeter());
        miObjeto1.setRadius(5.6);
        System.out.println("Depués del setter la información de mi círculo es: "+miObjeto1);
        System.out.println(" ");
        //Rectángulo
        Rectangle miObjeto2=new Rectangle(3,4,"blue",true);
        System.out.println("Está lleno?"+miObjeto2.isFilled());
        System.out.println("La anchura del rectángulo es: "+miObjeto2.getWidth());
        System.out.println("El área del rectángulo es: "+miObjeto2.getArea());
        System.out.println("El perímetro del rectángulo es: "+miObjeto2.getPerimeter());
        miObjeto2.setWidth(5.6);
        miObjeto2.setColor("pink");
        miObjeto2.setFilled(false);
        miObjeto2.setLength(2.1);
        System.out.println("Depués del setter la información de mi rectángulo es: "+miObjeto2);
        System.out.println(" ");
        //Square
        Square miObjeto3=new Square(6.4,"green",false);
        System.out.println("Está lleno?"+miObjeto2.isFilled());
        System.out.println("El lado del cuadrado es: "+miObjeto3.getSide());
        System.out.println("El área del cuadrado es: "+miObjeto3.getArea());
        System.out.println("El perímetro del cuadrado es: "+miObjeto3.getPerimeter());
        miObjeto3.setWidth(5.6);
        miObjeto2.setColor("purple");
        miObjeto2.setFilled(true);
        System.out.println("Depués del setter la información de mi cuadrado es: "+miObjeto3);



    }
}
