package Cuaderno_3.Ejercicio3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    Point2D p1= new Point2D();
    Point2D p= new Point2D(4,5);

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
        assertDoesNotThrow(()->p.setX(45));
        assertEquals(45,p.getX(),"set x");
    }

    @Test
    void setY() {
        assertDoesNotThrow(()->p.setY(72));
        assertEquals(72,p.getY(),"Set y");
    }

    @Test
    void setXY() {
        assertDoesNotThrow(()->p.setXY(4,9));
        assertEquals(4,p.getX(),"set xy");
        assertEquals(9,p.getY(),"set xy");
    }

    @Test
    void getXY() {
        assertEquals(4,p.getXY()[0],"xy");
        assertEquals(5,p.getXY()[1],"xy");
    }

    @Test
    void testToString() {
        String esperado="x=4.0, y=5.0 ";
        assertEquals(esperado,p.toString(),"string");
    }
}