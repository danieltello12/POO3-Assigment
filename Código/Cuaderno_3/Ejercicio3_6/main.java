package Cuaderno_3.Ejercicio3_6;

public class main {
    public static void main(String[] args){
        Dog perro= new Dog("Kiara");
        Dog perro2= new Dog("Lucky");
        Cat gato= new Cat("Marta");
        Animal animal= new Animal("Sergio");
        Mammal mammal= new Mammal("Hola");
        System.out.println(perro);
        System.out.println(perro2);
        System.out.println(gato);
        System.out.println(animal);
        System.out.println(mammal);
        perro.greet();
        perro.greets(perro2);
        gato.greets();

    }
}
