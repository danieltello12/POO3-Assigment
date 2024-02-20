package Ejercicio1_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaseBallTest {

    @Test
    void getX() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertEquals(1,miObjeto.getX(),"Ha cogido mal la x");
    }

    @Test
    void getY() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertEquals(5,miObjeto.getY(),"Ha cogido mal la y");
    }

    @Test
    void setX() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertDoesNotThrow(()->miObjeto.setX(6));
        assertEquals(6,miObjeto.getX(),"Ha puesto mal la x");
    }

    @Test
    void setRadius() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertDoesNotThrow(()->miObjeto.setRadius(8));
        assertEquals(8,miObjeto.getRadius(),"Ha puesto mal el radio");
    }

    @Test
    void setxDelta() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertDoesNotThrow(()->miObjeto.setRadius(8));
        assertEquals(8,miObjeto.getRadius(),"Ha puesto mal el radio");
    }

    @Test
    void setY() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertDoesNotThrow(()->miObjeto.setY(9));
        assertEquals(9,miObjeto.getY(),"Ha puesto mal la Y");
    }

    @Test
    void getRadius() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertEquals(3,miObjeto.getRadius(),"Ha cogido mal el radio");
    }

    @Test
    void getXDelta() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertEquals(45,miObjeto.getXDelta(),"Ha cogido mal la xdelta");
    }

    @Test
    void getYDelta() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertEquals(6,miObjeto.getYDelta(),"Ha cogido mal la ydelta");

    }

    @Test
    void setyDelta() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertDoesNotThrow(()->miObjeto.setyDelta(60));
        assertEquals(60,miObjeto.getYDelta(),"Ha puesto mal la Ydelta");
    }

    @Test
    void move() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertDoesNotThrow(()->miObjeto.move());
        assertEquals(1+45,miObjeto.getX(),"Mal el movimiento eje x");
        assertEquals(5+6,miObjeto.getY(),"Mal el movimiento eje Y");

    }

    @Test
    void reflectHorizontal() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertDoesNotThrow(()->miObjeto.reflectHorizontal());
        assertEquals(-45,miObjeto.getXDelta(),"Mal la refelxion horizontal");
    }

    @Test
    void reflectVertical() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        assertDoesNotThrow(()->miObjeto.reflectVertical());
        assertEquals(-6,miObjeto.getYDelta(),"Mal la refelxion vertical");
    }

    @Test
    void testToString() {
        ClaseBall miObjeto=new ClaseBall(1,5,3,45,6);
        String salidaEsperada="Ball[(1.0,5.0),speed=(45.0,6.0)]";
        assertEquals(salidaEsperada,miObjeto.toString(),"No sale el mismo texto en toString");
    }
}