package Cuaderno_4.Ejercicio6_6;

public class Dog  extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Wooooof");
    }
    public void greets(Dog another){
        System.out.println("Wooooooooof");
    }

}
