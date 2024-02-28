package Cuaderno1.Ejercicio1_1;

import Cuaderno_1.Ejercicio1_1.Circle;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
Circle c= new Circle(5);
Circle c3= new Circle();
Circle c4= new Circle(4,"rojo");
    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle miObjeto=new Circle(3d);
        assertEquals(3d,miObjeto.getRadius(),"No ha devuelto el radio adecuado");
    }



    @org.junit.jupiter.api.Test
    void getColor() {
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle miObjeto=new Circle(4d);
        assertEquals(4*4*Math.PI,miObjeto.getArea());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        double newRadius=3.4d;
        Circle miObjeto2= new Circle();
        assertDoesNotThrow(()->miObjeto2.setRadius(newRadius));
        assertEquals(newRadius,miObjeto2.getRadius(),"Los radios no son iguales");
    }

    @org.junit.jupiter.api.Test
    void setColor() {
        String newColor="red";
        Circle miObjeto2= new Circle();
        assertDoesNotThrow(()->miObjeto2.setColor(newColor));
        assertEquals(newColor,miObjeto2.getColor(),"Los colores no son iguales");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String color="red";
        double radius=4.3d;
        Circle s=new Circle();
        s.setRadius(radius);
        s.setColor(color);

        String salidaEsperada="Circle[radius=4.3 color=red]";
        assertEquals(salidaEsperada,s.toString(),"No sale el mismo texto en toString");
    }
}