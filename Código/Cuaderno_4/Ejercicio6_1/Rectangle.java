package Cuaderno_4.Ejercicio6_1;



public class Rectangle extends Shape1 {
    protected double width=1.0;
    protected double length=1.0;

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
    @Override
    public double getArea(){
        return this.length*this.width;
    }
    @Override
    public double getPerimeter(){
        return ((this.length*2)+(this.width*2));
    }
    @Override

    public String toString() {
        return "Rectangle: "+super.toString()
                + " , width=" + width+ " length: "+length;
    }
}
