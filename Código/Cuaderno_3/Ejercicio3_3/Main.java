package Cuaderno_3.Ejercicio3_3;

public class Main {
    public static void main(String[] args) {
        Point3D miObjeto=new Point3D(3.4f,2.3f,6.4f);
        System.out.println(miObjeto);
        System.out.println("Las coordenadas son: "+miObjeto.getXYZ()[0]+","+ miObjeto.getXYZ()[1]+","+ miObjeto.getXYZ()[2]);
    }
}
