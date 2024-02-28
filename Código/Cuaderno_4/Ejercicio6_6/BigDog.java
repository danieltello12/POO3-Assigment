package Cuaderno_4.Ejercicio6_6;

public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Wooooooof");
    }

    public void greets(Dog another){
        System.out.println("Wooooooooooofff");
    }

    public void greets(BigDog another){
        System.out.println("Woooooooooooooooofffff");
    }
}
