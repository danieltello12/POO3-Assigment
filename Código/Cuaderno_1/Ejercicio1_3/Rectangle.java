package Cuaderno_1.Ejercicio1_3;
///cvh<vbk<xl
public class Rectangle {
    private float length;
    private float width;
    public Rectangle(){
        length=2.5f;
        width=3.4f;

    }
    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;

    }

    public float getLength(){
        return length;
    }
    public void setLength(float newlength){
        this.length=newlength;

    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float newWidth){
        this.width=newWidth;

    }

    public double getArea(){
        double area= length*width;
        return area;
    }

    public double getPerimetrer(){

        return (length*2)+(width*2);
    }

    public String toString() {

        return "Rectángulo[altura=" + length + " anchura=" + width + "]";
    }
}
