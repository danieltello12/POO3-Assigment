package Ejercicio1_7;

public class Main {
    public static void main(String[] args) {
        ClaseDate miObjeto=new ClaseDate(1,2,2003);
        System.out.println(miObjeto);

        miObjeto.setDay(3);
        miObjeto.setMonth(4);
        miObjeto.setYear(1903);
        System.out.println(miObjeto);
        System.out.println("Month: "+miObjeto.getMonth());
        System.out.println("Day: "+miObjeto.getDay());
        System.out.println("Year:"+miObjeto.getYear());

        miObjeto.setDate(5,2,2016);
        System.out.println(miObjeto);

    }
}


