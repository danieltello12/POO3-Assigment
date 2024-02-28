package Cuaderno_3.Ejercicio3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r2= new Rectangle();
    Rectangle r3= new Rectangle(4,9);
Rectangle r= new Rectangle(4,5,"azul",true);
    @Test
    void getWidth() {
        assertEquals(4,r.getWidth(),"width");
    }

    @Test
    void getLength() {
        assertEquals(5,r.getLength(),"length");
    }

    @Test
    void setWidth() {
        assertDoesNotThrow(()->r.setWidth(5));
        assertEquals(5,r.getWidth(),"set width");
    }

    @Test
    void setLength() {
        assertDoesNotThrow(()->r.setLength(6));
        assertEquals(6,r.getLength(),"set length");
    }

    @Test
    void getArea() {
        assertEquals(20,r.getArea(),"area");
    }

    @Test
    void getPerimeter() {
        assertEquals(18,r.getPerimeter(),"perimetro");
    }

    @Test
    void testToString() {
        String esperado="Rectangle: Shape[color='azul', filled=true] , width=4.0 length: 5.0";
        assertEquals(esperado,r.toString(),"string");
    }
}