package Cuaderno_3.Ejercicio3_6;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Weaw");
    }
    public String toString(){
        return"Cat["+super.toString()+"]";
    }
}
