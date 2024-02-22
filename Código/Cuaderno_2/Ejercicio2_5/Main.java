package Cuaderno_2.Ejercicio2_5;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Clase customer
        Customer miObjeto=new Customer(456,"Paco",20);


        //Clase account
        Account miObjeto2=new Account(456,miObjeto ,450);
        Account miObjeto3=new Account(342,miObjeto);
        System.out.println("El ID es:" +miObjeto2.getId());
        System.out.println("La información del cliente es:"+miObjeto2.getCostumer());
        System.out.println("El balance es: "+miObjeto2.getBalance());
        miObjeto2.setBalance(345);
        System.out.println("La nueva información después del setter es:"+miObjeto2);
        System.out.println("El nombre del cliente es:" +miObjeto2.getCostumerName());
        miObjeto2.deposit(450);
        System.out.println("La información final después del depósito es :"+miObjeto2);
        miObjeto2.withdraw(245);
        System.out.println("La información final después de la substracción  es: " +miObjeto2);



    }
}
