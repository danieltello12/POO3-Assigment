package Cuaderno_4.Ejercicio6_1;


public class Circle extends Shape1 {
    protected double radius=1.0;
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
        return "Circle: "+super.toString()
                + " , radio=" + radius;
    }
}
