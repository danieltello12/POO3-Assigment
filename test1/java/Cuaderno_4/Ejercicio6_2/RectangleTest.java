package Cuaderno_4.Ejercicio6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r= new Rectangle(4,5);

    @Test
    void testToString() {
        String esperado="Rectangle[width= 4.0, length= 5.0]";
        assertEquals(esperado,r.toString());
    }

    @Test
    void getArea() {
        assertEquals(4*5,r.getArea());

    }

    @Test
    void getPerimeter() {
        assertEquals(4+5+4+5,r.getPerimeter());
    }
}