package Cuaderno_3.Ejercicio3_5;

public class Rectangle extends Shape{
    private double width=1.0;
    private double length=1.0;

    public Rectangle(){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length,String color,boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;

    }




    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return this.length*2+this.width*2;
    }

    public String toString() {
        return "Rectangle: "+super.toString()
                + " , width=" + width+ " length: "+length;
    }
}
