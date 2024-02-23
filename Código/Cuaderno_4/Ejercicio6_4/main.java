package Cuaderno_4.Ejercicio6_4;

public class main {
    public static void main(String[] args){
        Movable Mp= new MovablePoint(1,2,9,7);
        Mp.MoveDown();
        System.out.println("Nuevas coordenadas"+ Mp.toString());
        Mp.MoveUP();
        System.out.println("Nuevas coordenadas"+ Mp.toString());
        Mp.MoveRight();
        System.out.println("Nuevas coordenadas"+ Mp.toString());
        Mp.MoveLeft();
        System.out.println("Nuevas coordenadas"+ Mp.toString());

        System.out.println("Circulo");

        Movable c1= new MovableCircle(4,3,8,7,6);
        c1.MoveDown();
        System.out.println("Nuevas coordenadas"+ c1.toString());
        c1.MoveUP();
        System.out.println("Nuevas coordenadas"+ c1.toString());
        c1.MoveRight();
        System.out.println("Nuevas coordenadas"+ c1.toString());
        c1.MoveLeft();
        System.out.println("Nuevas coordenadas"+ c1.toString());

    }
}
