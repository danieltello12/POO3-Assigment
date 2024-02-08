package Ejercicio1_2;

public class Circle {
     private double radius=1.0;
     private String color= "Red";
    public Circle(){
        Circle c1= new Circle();

    }
    public Circle(Double radio){
        this.radius=radio;
        Circle c1= new Circle();
    }
    public double getRadio(){

        return radius;
    }
    public void setRadio(Double radio){
        radius=radio;

    }
    public double getArea(){
        double area;
        area= (Math.PI)*radius*radius;
        return area;
    }
    public double getCircunferencia(){
        double perimetro;
        perimetro=2*(Math.PI)*radius;
        return perimetro;

    }
    public String toString(){
        Circle c1= new Circle();
        return "Hola";
    }
}
