package Cuaderno_3.Ejercicio3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point p1= new Point();
    Point p= new Point(4,5);
    @Test
    void getX() {
        assertEquals(4,p.getX(),"x");
    }

    @Test
    void getY() {
        assertEquals(5,p.getY(),"y");
    }

    @Test
    void setX() {
        assertDoesNotThrow(()->p.setX(6));
        assertEquals(6,p.getX(),"x");
    }

    @Test
    void setY() {
        assertDoesNotThrow(()->p.setY(8));
        assertEquals(8,p.getY(),"y");

    }

    @Test
    void getXY() {
        assertEquals(4,p.getXY()[0],"xy");
        assertEquals(5,p.getXY()[1],"xy");
    }

    @Test
    void setXY() {
        assertDoesNotThrow(()->p.setXY(8,9));
        assertEquals(8,p.getX(),"xy");
        assertEquals(9,p.getY(),"xy");
    }

    @Test
    void testToString() {
        String esperado="(4.0,5.0)";
        assertEquals(esperado,p.toString(),"string");
    }
}