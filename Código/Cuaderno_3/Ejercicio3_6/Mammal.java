package Cuaderno_3.Ejercicio3_6;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal["+super.toString()+"]";
    }
}
