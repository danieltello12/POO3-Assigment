package Cuaderno_4.Ejercicio6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
Circle c= new Circle(4);
    @Test
    void testToString() {
assertEquals("Circle[radio=4.0]",c.toString());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI*4*4,c.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(Math.PI*4*2,c.getPerimeter());
    }

    @Test
    void testToString1() {assertEquals("Circle[radio=4.0]",c.toString());
    }

    @Test
    void testGetArea() {assertEquals(Math.PI*4*4,c.getArea());
    }

    @Test
    void testGetPerimeter() {assertEquals(Math.PI*4*2,c.getPerimeter());
    }
}