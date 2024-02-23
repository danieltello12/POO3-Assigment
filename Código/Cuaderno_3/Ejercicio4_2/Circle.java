package Cuaderno_3.Ejercicio4_2;

public class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle() {
        this.radius=radius;
        this.color=color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        double area=Math.PI*this.radius*this.radius;
        return area;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
