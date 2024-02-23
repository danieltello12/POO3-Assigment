package Cuaderno_3.Ejercicio3_5;

public class Circle extends Shape{
    private double radius=1.0;
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return Math.PI*this.radius*2;
    }

    public String toString() {
        return "Circle: "+super.toString()
                + " , radio=" + radius;
    }
}
