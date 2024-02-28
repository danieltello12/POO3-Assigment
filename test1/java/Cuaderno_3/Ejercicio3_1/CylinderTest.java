package Cuaderno_3.Ejercicio3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder c3= new Cylinder();
    Cylinder c2= new Cylinder(5);
    Cylinder c1= new Cylinder(6,9);
    Cylinder c= new Cylinder(4,8,"rojo");


    @Test
    void getHeight() {
        assertEquals(8,c.getHeight(),"heihgt");
    }

    @Test
    void setHeight() {
        assertDoesNotThrow(()->c.setHeight(6));
        assertEquals(6,c.getHeight(),"set height");
    }

    @Test
    void getVolume() {
        Circle c1= new Circle(4);
        double esperado= c1.getArea()*8;
        assertEquals(esperado,c.getVolume());
    }

    @Test
    void testToString() {
        String esperado="Cylinder: subclass of Circle{radius=4.0, color='rojo'} height=8.0";
        assertEquals(esperado,c.toString(),"string");
    }
}