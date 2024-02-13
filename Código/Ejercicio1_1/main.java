package Ejercicio1_1;

public class main {
    public static void main(String[] args) {
        //Llamamos a la función
        Circle miObjeto=new Circle(); //Realizamos una sobrecarga de constructores con distintos parámetros
        double radio=miObjeto.getRadius();
        Circle miObjeto2= new Circle(2.7);
        double radio2=miObjeto2.getRadius();
        double area= miObjeto.getArea();
        double area2= miObjeto2.getArea();
        Circle miObjeto3=new Circle(2.5,"red");
        double radio3= miObjeto3.getRadius();
        String color1=miObjeto3.getColor();
        System.out.println("El radio es:"+ radio3+ "y su color es:"+ color1);
        miObjeto3.setRadius(5.5);
        System.out.println("Ahora mi radio ha cambiado a:"+miObjeto3.getRadius()+" debido al setter");
        System.out.println(miObjeto3.toString());




    }


}
