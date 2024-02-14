package Ejercicio1_5;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        InvoiceItem miObjeto=new InvoiceItem("A202","pen black",4,2);
        System.out.println(miObjeto);
        miObjeto.setUnitPrice(3);
        System.out.println(miObjeto);
        System.out.println("id:" +miObjeto.getId());
        System.out.println("desc:" +miObjeto.getDesc());
        System.out.println("qty:" +miObjeto.getQty());
        System.out.println("unitPrice:" +miObjeto.getUnitPrice());
        System.out.println("The total:"+miObjeto.getTotal());


    }


}
