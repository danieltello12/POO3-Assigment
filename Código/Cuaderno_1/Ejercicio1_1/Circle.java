package Cuaderno_1.Ejercicio1_1;
// hv<sfl<zvkjlf

public class Circle {
    private double radius;
    private String color;



    public Circle(){//Primer constructor
        radius=1.5;
        color="black";
    }
    public Circle(double radius){
        this.radius=radius;
        color="black";

    }

    public  Circle(double radius,String color){
        this.radius=radius;
        this.color=color;

    }
    public double getRadius(){

        return radius;
    }

    public String getColor(){
        return color;
    }


    public double getArea(){

        return radius*radius*Math.PI;
    }

    public void setRadius(double newRadius){

        radius=newRadius;
    }
    public void setColor(String newColor){
        color=newColor;
    }


    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

}
