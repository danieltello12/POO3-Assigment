package Ejercicio1_1;

public class main {
    public static void main(String[] args) {
        Circle miObjeto=new Circle();
        System.out.println(miObjeto);
        Circle miObjeto2=new Circle(2.1);
        System.out.println(miObjeto2);
        Circle miObjeto3=new Circle(4.3,"red");
        System.out.println(miObjeto3);

        System.out.println("El radio del círculo 2 es: "+miObjeto2.getRadius());
        miObjeto2.setRadius(4.3);
        System.out.println("Ahora el radio del círculo 2 es:"+ miObjeto2.getRadius()+ " debido al setter");
        System.out.println("El color del círculo 1: "+ miObjeto.getColor());
        miObjeto.setColor("red");
        System.out.println("El color del círculo 1 después del setter es: "+ miObjeto.getColor());

    }
}
