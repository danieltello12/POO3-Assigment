package Cuaderno_4.Ejercicio6_2;

public class Circle implements GeometricObject{
    double radio;
    public Circle(double radio){
        this.radio=radio;
    }
    public String toString(){
        return "Circle[radio="+this.radio+"]";
    }
    public double getArea(){
        return(Math.PI*this.radio*this.radio);
    }
    public double getPerimeter(){
        return(2*this.radio*Math.PI);
    }
}
