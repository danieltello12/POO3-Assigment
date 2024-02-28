package Cuaderno_3.Ejercicio3_4;

import java.util.Arrays;

public class main {
    public static void main(String[] args){
        MovablePoint mv= new MovablePoint(2,5,3,6);
        System.out.println(mv.getX());
        System.out.println(mv.getY());
        System.out.println(mv.getXY());
        System.out.println(mv.getSpeed());
        System.out.println(mv.getxSpeed());
        System.out.println(mv.getySpeed());
        mv.setSpeed(4,5);
        mv.setxSpeed(6);
        mv.setySpeed(1);
        mv.setX(6);
        mv.setY(4);
        mv.setXY(25,5);
        System.out.println(mv.getX());
        System.out.println(mv.getY());
        System.out.println(Arrays.toString(mv.getXY()));
        System.out.println(Arrays.toString(mv.getSpeed()));
        System.out.println(mv.getxSpeed());
        System.out.println(mv.getySpeed());
        Point p= new Point(4,5);
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(Arrays.toString(p.getXY()));
        p.setX(5);
        p.setXY(4,5);
        p.setY(4);
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(Arrays.toString(p.getXY()));
        System.out.println(mv);



    }
}
