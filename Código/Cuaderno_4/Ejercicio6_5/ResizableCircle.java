package Cuaderno_4.Ejercicio6_5;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }

    public void resize(int percent){
        this.radius*= (double) percent /100; //Casteamos el porcentaje al mismo tipo que radio

    }
@Override
    public String toString(){
        return "ResizableCircle "+super.toString();
    }
}
