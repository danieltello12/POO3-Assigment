package Cuaderno_3.Ejercicio4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c2= new Circle(4);
    Circle c3= new Circle();
    Circle c= new Circle(4,"rojo");

    @Test
    void getRadius() {
        assertEquals(4,c.getRadius());
    }

    @Test
    void getColor() {
        assertEquals("rojo",c.getColor());
    }

    @Test
    void setRadius() {
        assertDoesNotThrow(()->c.setRadius(6));
        assertEquals(6,c.getRadius());
    }

    @Test
    void setColor() {
        assertDoesNotThrow(()->c.setColor("azul"));
        assertEquals("azul",c.getColor());
    }

    @Test
    void getArea() {
        double esperado=Math.PI*c.getRadius()*c.getRadius();
        assertEquals(esperado,c.getArea());
    }

    @Test
    void testToString() {
        String esperdo="Circle{radius=4.0, color='rojo'}";
        assertEquals(esperdo,c.toString());
    }
}