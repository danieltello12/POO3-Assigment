package Cuaderno_4.Ejercicio6_6;

public class main {
    public static void main(String[]args){
        Cat c= new Cat("lucia");
        Dog d= new Dog("Kiara");
        Dog d2= new Dog("Lucky");
        BigDog bd= new BigDog("kiara");
        BigDog bd2= new BigDog("Lucky");
        c.greets();
        d.greets();
        d.greets(d2);
        bd.greets();
        bd.greets(d);
        bd.greets(bd2);
    }
}
