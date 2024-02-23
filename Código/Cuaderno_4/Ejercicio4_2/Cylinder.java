package Cuaderno_4.Ejercicio4_2;

public class Cylinder {
    private Circle base;
    private double height=1.0;

    public Cylinder() {
        this.base= new Circle();
        this.height=1.0;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }
    public Cylinder (double radius,double height,String color){
        this.base= new Circle(radius,color);
        this.height=height;

    }
    public Cylinder(double radio, double heigh){
        this.base= new Circle(radio);
        this.height=heigh;
    }

    public Circle getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(Circle base) {
        this.base = base;
    }
    public void setBase(double radio, String color){
        this.base= new Circle(radio,color);
    }
    public void setBase(double radio){
        this.base=new Circle(radio);
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolumen(){
        return(this.base.getArea()*height);
    }

    public String toString() {
        return "Cylinder: Base= " + this.base.toString()
                + " height=" + height;
    }
}
