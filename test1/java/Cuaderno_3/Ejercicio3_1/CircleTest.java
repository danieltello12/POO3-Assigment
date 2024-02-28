package Cuaderno_3.Ejercicio3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c2= new Circle(4);
    Circle c3= new Circle();
Circle c= new Circle(3,"rojo");
    @Test
    void getRadius() {
        assertEquals(3,c.getRadius(),"radio");
    }

    @Test
    void getColor() {
        assertEquals("rojo",c.getColor());
    }

    @Test
    void setRadius() {
        assertDoesNotThrow(()->c.setRadius(6));
        assertEquals(6,c.getRadius(),"set radio");
    }

    @Test
    void setColor() {
        assertDoesNotThrow(()->c.setColor("verde"));
        assertEquals("verde",c.getColor(),"set color");
    }

    @Test
    void getArea() {
        double esperado= Math.PI*c.getRadius()*c.getRadius();
        assertEquals(esperado,c.getArea(),"area");
    }

    @Test
    void testToString() {
        String esperado="Circle{radius=3.0, color='rojo'}";
        assertEquals(esperado,c.toString(),"string");
    }
}