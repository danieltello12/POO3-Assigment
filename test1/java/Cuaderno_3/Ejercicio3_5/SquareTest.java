package Cuaderno_3.Ejercicio3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square s2= new Square();
    Square s3= new Square(4);
    Square c= new Square(4,"rojo",true);

    @Test
    void getSide() {
        assertEquals(4,c.getSide());
    }

    @Test
    void setSide() {
        assertDoesNotThrow(()->c.setSide(5));
        assertEquals(5,c.getSide(),"set side");
    }

    @Test
    void setWidth() {
        assertDoesNotThrow(()->c.setWidth(6));
        assertEquals(6,c.getWidth(),"set width");
    }

    @Test
    void setLength() {
        assertDoesNotThrow(()->c.setLength(6));
        assertEquals(6,c.getLength(),"set length");
    }

    @Test
    void testToString() {
        String esperado="Square: Rectangle: Shape[color='rojo', filled=true] , width=4.0 length: 4.0";
        assertEquals(esperado,c.toString(),"string");
    }
}