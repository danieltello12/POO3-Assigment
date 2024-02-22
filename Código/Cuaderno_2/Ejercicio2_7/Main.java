package Cuaderno_2.Ejercicio2_7;

public class Main {
    public static void main(String[] args) {
        MyLine miObjeto=new MyLine(34,49,14,20);
        System.out.println(miObjeto);
        System.out.println("Las coordenadas del principio son: "+"("+miObjeto.getBeginXY()[0]+"," +miObjeto.getBeginXY()[1]+")");
        System.out.println("Las coordenadas del final son: "+"("+miObjeto.getEndXY()[0]+"," +miObjeto.getEndXY()[1]+")");
        Mypoint coordnuevas=new Mypoint(48,15);
        miObjeto.setBegin(coordnuevas);
        System.out.println("El principio de mi nuevo objeto es:" +miObjeto);
        miObjeto.setEndXY(49,23);
        System.out.println("Las nuevas coordenadas del final son: "+miObjeto);
        miObjeto.setBeginXY(0,0);
        System.out.println("Las nuevas coordenadas del principio son: "+miObjeto);
        System.out.println("Mis coordenadas X actuales del final son: "+miObjeto.getEndX());
        System.out.println("Mis coordenadas X actuales del principio son: "+miObjeto.getBeginX());
        System.out.println("Mis coordenadas Y actuales del final son: "+miObjeto.getEndY());
        System.out.println("Mis coordenadas Y actuales del principio son: "+miObjeto.getBeginY());
        System.out.println("La longitud es:"+miObjeto.getLength());
        System.out.println("El gradient es: "+miObjeto.getGradient());
        Mypoint coordnuevas2=new Mypoint(34,23);
        MyLine miObjeto2=new MyLine(coordnuevas,coordnuevas2);
        System.out.println("Mis coordenas anteriores de begin y las nuevas creamos las nuevas coord: "+miObjeto2);
        System.out.println("La longitud del objeto 2 es:"+miObjeto2.getLength());
        System.out.println("El gradient del objeto 2 es: "+miObjeto2.getGradient());


    }
}
