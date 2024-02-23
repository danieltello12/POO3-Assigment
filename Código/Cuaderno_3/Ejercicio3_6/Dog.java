package Cuaderno_3.Ejercicio3_6;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greet(){
        System.out.println("wooof");
    }
    public void greets(Dog another){
        System.out.println("Wooooooof");
    }
    public String toString(){
        return "Dog["+super.toString()+"]";
    }
}
