package Cuaderno_3.Ejercicio4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder c3= new Cylinder();
    Cylinder c2= new Cylinder(4,5,"rojo");
    Circle base= new Circle(4,"rojo");
    Cylinder c1= new Cylinder(base,8);
    Cylinder c= new Cylinder(5,4);

    @Test
    void getBase() {
        assertEquals(base.getRadius(),c1.getBase().getRadius());
        assertEquals(base.getColor(),c1.getBase().getColor());
    }

    @Test
    void getHeight() {
        assertEquals(8,c1.getHeight());
    }

    @Test
    void setBase() {
        assertDoesNotThrow(()->c2.setBase(base));
        assertEquals(base.getRadius(),c2.getBase().getRadius());
        assertEquals(base.getColor(),c2.getBase().getColor());
    }

    @Test
    void testSetBase() {
        assertDoesNotThrow(()->c1.setBase(9,"azul"));
        assertEquals(9,c1.getBase().getRadius());
        assertEquals("azul",c1.getBase().getColor());
    }

    @Test
    void testSetBase1() {
        assertDoesNotThrow(()->c3.setBase(4));
        assertEquals(4,c3.getBase().getRadius());
    }

    @Test
    void setHeight() {
        assertDoesNotThrow(()->c2.setHeight(1));
        assertEquals(1,c2.getHeight());
    }

    @Test
    void getVolumen() {
        assertEquals((c1.getBase().getArea()*c1.getHeight()),c1.getVolumen());
    }

    @Test
    void testToString() {
        String esperado="Cylinder: Base= Circle{radius=4.0, color='rojo'} height=5.0";
        assertEquals(esperado,c2.toString());
    }
}