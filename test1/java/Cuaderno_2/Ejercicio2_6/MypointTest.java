package Cuaderno_2.Ejercicio2_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MypointTest {
Mypoint mp= new Mypoint(4,5);
Mypoint mp2= new Mypoint();
    @Test
    void getX() {
        assertEquals(4,mp.getX(),"x");
    }

    @Test
    void getY() {
        assertEquals(5,mp.getY(),"y");
    }

    @Test
    void setX() {
        assertDoesNotThrow(()->mp.setX(6));
        assertEquals(6,mp.getX(),"x");
    }

    @Test
    void setY() {
        assertDoesNotThrow(()->mp.setY(8));
        assertEquals(8,mp.getY(),"y");

    }

    @Test
    void getXY() {
        assertEquals(4,mp.getXY()[0],"xy");
        assertEquals(5,mp.getXY()[1],"xy");
    }

    @Test
    void setXY() {
        assertDoesNotThrow(()->mp.setXY(8,9));
        assertEquals(8,mp.getX(),"xy");
        assertEquals(9,mp.getY(),"xy");

    }

    @Test
    void testToString() {
        String esperado="(4,5)";
        assertEquals(esperado,mp.toString(),"string");
    }

    @Test
    void distance() {
        int x= mp.getX();
        int y=mp.getY();
        int x2= 4;
        int y2=9;
        assertEquals(Math.sqrt(((x2-x)*(x2-x))+((y2-y)*(y2-y))),mp.distance(x2,y2),"distance");

    }

    @Test
    void distancia() {
        Mypoint mp2= new Mypoint(4,5);
        assertEquals(mp.distance(4,5),mp.distancia(mp2),"distancia");
    }

    @Test
    void testDistancia() {
        assertEquals(mp.distance(0,0),mp.distancia());
    }
}