package Cuaderno_4.Ejercicio6_2;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public String toString(){
        return "Rectangle[width= "+this.width+", length= "+this.length+"]";
    }
    public double getArea(){
        return(this.length*this.width);
    }
    public double getPerimeter(){
        return((this.length*2)+(this.width*2));
    }
}
