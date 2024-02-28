package Cuaderno_4.Ejercicio6_3;



public class Main {
    public static void main(String[] args) {
        Movable Mp= new MovablePoint(1,2,9,7);
        System.out.println(Mp);
        Mp.MoveDown();
        System.out.println("Nuevas coordenadas"+ Mp);
        Mp.MoveUP();
        System.out.println("Nuevas coordenadas"+ Mp);
        Mp.MoveRight();
        System.out.println("Nuevas coordenadas"+ Mp);
        Mp.MoveLeft();
        System.out.println("Nuevas coordenadas"+ Mp);



    }

}

