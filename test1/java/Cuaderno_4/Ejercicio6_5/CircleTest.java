package Cuaderno_4.Ejercicio6_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
Circle c= new Circle();
Circle c2= new Circle(4);
    @Test
    void getArea() {
        assertEquals(Math.PI*4*4,c2.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(Math.PI*4*2,c2.getPerimeter());
    }

    @Test
    void testToString() {
        String esperado= "Circle[radio=4.0]";
    }
}