package Cuaderno_3.Ejercicio3_3;

public class Main {
    public static void main(String[] args) {
        Point3D miObjeto=new Point3D(3.4f,2.3f,6.4f);
        System.out.println("Las coordenadas son: x= "+miObjeto.getXYZ()[0]+" y="+ miObjeto.getXYZ()[1]+" z="+ miObjeto.getXYZ()[2]);
        miObjeto.setXYZ(3.3f,4.5f,2.3f);
        System.out.println("Mis coordenadas después del setter x son: "+miObjeto.getX());
        System.out.println("Mis coordenadas después del setter y son: "+miObjeto.getY());
        System.out.println("Mis coordenadas después del setter z son: "+miObjeto.getZ());
        miObjeto.setY(2.3f);
        miObjeto.setX(4.9f);
        miObjeto.setZ(1.2f);
        System.out.println("Otras nuevas coordenadas después de los setters son: "+miObjeto);
        System.out.println("Mis coordenadas XY son:"+"("+miObjeto.getXY()[0]+","+miObjeto.getXY()[1]+")");
        System.out.println("Mi coordenada Z es: "+miObjeto.getXYZ()[2]);
    }
}
