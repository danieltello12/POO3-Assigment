package Cuaderno_4.Ejercicio6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
Rectangle r= new Rectangle();
Rectangle r2= new Rectangle(4,5);
Rectangle r3= new Rectangle(4,5,"red",true);

    @Test
    void getWidth() {
        assertEquals(4,r2.getWidth());
    }

    @Test
    void getLength() {
        assertEquals(5,r2.getLength());
    }

    @Test
    void setWidth() {
        assertDoesNotThrow(()->r2.setWidth(9));
        assertEquals(9,r2.getWidth());
    }

    @Test
    void setLength() {
        assertDoesNotThrow(()->r2.setLength(9));
        assertEquals(9,r2.getLength());
    }

    @Test
    void getArea() {
        assertEquals(r2.getWidth()*r2.getLength(),r2.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(4+4+5+5,r2.getPerimeter());
    }

    @Test
    void testToString() {
        String esperado="Rectangle: Shape[color='red', filled=true] , width=4.0 length: 5.0";
        assertEquals(esperado,r3.toString());
    }
}