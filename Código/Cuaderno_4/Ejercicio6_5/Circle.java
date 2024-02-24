package Cuaderno_4.Ejercicio6_5;

public class Circle implements GeometricObject{
    protected double radius;
    public Circle(){

    }
    public Circle(double radius){

        this.radius=radius;
    }

    @Override
    public double getArea(){

        return Math.PI*this.radius*this.radius;
    }
    @Override
    public double getPerimeter(){

        return Math.PI*this.radius*2;
    }
    @Override
    public String toString() {
        return "Circle[radio="+this.radius+"]";
    }
}
