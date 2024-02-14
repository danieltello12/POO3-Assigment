package Ejercicio1_3;
///HVcvjvhllaaa

public class Main {
    public static void main(String[] args) {
        Rectangle miObjeto1=new Rectangle(1.2f,2.4f);
        System.out.println(miObjeto1.toString());
        Rectangle miObjeto2=new Rectangle();
        System.out.println(miObjeto2);

        miObjeto1.setLength(4.5f);
        miObjeto1.setWidth(3.3f);
        System.out.println(miObjeto1);
        System.out.println("La altura del rectángulo2 es"+miObjeto2.getLength());
        System.out.println("La anchura del rectángulo2 es"+miObjeto2.getWidth());

        System.out.println("El área del rectángulo 2 es:"+ miObjeto2.getArea());
        System.out.println("El área del rectángulo 2 es:"+ miObjeto2.getArea());




    }
}
