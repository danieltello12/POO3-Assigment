package Cuaderno_4.Ejercicio6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
Square s= new Square();
Square s2= new Square(4);
Square s3= new Square(4,"red",true);
    @Test
    void getSide() {
        assertEquals(4,s2.getSide());
    }

    @Test
    void setSide() {
        assertDoesNotThrow(()->s3.setSide(6));
        assertEquals(6,s3.getSide());
    }

    @Test
    void setWidth() {
        assertDoesNotThrow(()->s.setWidth(6));
        assertEquals(6,s.getWidth());
    }

    @Test
    void setLength() {
        assertDoesNotThrow(()->s.setLength(7));
        assertEquals(7,s.getLength());
    }

    @Test
    void testToString() {
        String esperado="Square: Rectangle: Shape[color='red', filled=true] , width=4.0 length: 4.0";
        assertEquals(esperado,s3.toString());
    }
}