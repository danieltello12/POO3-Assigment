package Cuaderno_4.Ejercicio4_1;

public class Main {
    public static void main(String[] args) {
        //Line
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(5,9);
        Point p2 = new Point(8,10);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        System.out.println("Las coordenadas del principio de l2 son: "+l2.getBegin());
        System.out.println("Las coordenadas del final de l2 son: "+l2.getEnd());
        l2.setBeginXY(2,3);
        l2.setEndXY(4,5);
        System.out.println("La longitud con las nuevas coordenadas"+l2.getLength());
        System.out.println("El gradient con las nuevas coordenadas"+l2.getGradient());
        System.out.println(" ");
        //LineSub
        Point p3 = new Point(7,2);
        Point p4 = new Point(11,14);
        LineSub l3=new LineSub(p3,p4);

        System.out.println(l3);


        System.out.println("Las coordenadas del principio de l3 son: "+l3.getBegin());
        System.out.println("Las coordenadas del final de l3 son: "+l3.getEnd());
        l3.setBeginXY(12,4);
        l3.setEndXY(21,5);
        System.out.println("Después del setter "+l3);
        System.out.println("La longitud con las nuevas coordenadas: "+l3.getLength());
        System.out.println("El gradient con las nuevas coordenadas: "+l3.getGradient());

    }
}
