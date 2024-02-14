
package Ejercicio1_2;
////<bcj<vxvjkz
public class Circle2 {
    private double radius;
    public  Circle2(){
        radius=1.0;

    }
    public Circle2(Double radio){
        this.radius=radio;

    }
    public double getRadio(){

        return radius;
    }
    public void setRadio(Double radio){
        this.radius=radio;

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
    public String toString() {
        return "Circle[radius:"+radius+"]";
    }
}
