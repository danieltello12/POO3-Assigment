package Cuaderno_2.Ejercicio2_7;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {
    Mypoint begin= new Mypoint(4,5);
    Mypoint fin= new Mypoint(8,15);
    MyLine ml= new MyLine(begin,fin);
    MyLine ml2= new MyLine(4,6,8,9);

    @Test
    void getBegin() {
        assertEquals(begin,ml.getBegin(),"begin");
    }

    @Test
    void getEnd() {
        assertEquals(fin,ml.getEnd(),"end");
    }

    @Test
    void setBegin() {
        assertDoesNotThrow(()->ml.setBegin(fin));
        assertEquals(fin,ml.getBegin(),"set begin");
    }

    @Test
    void setEnd() {
        assertDoesNotThrow(()->ml.setEnd(begin));
        assertEquals(begin,ml.getEnd(),"set end");
    }

    @Test
    void getBeginX() {
        assertEquals(begin.getX(),ml.getBeginX(),"beginn x");
    }

    @Test
    void getBeginY() {
        assertEquals(begin.getY(),ml.getBeginY(),"beginn y");
    }

    @Test
    void setBeginX() {
        assertDoesNotThrow(()->ml.setBeginX(3));
        assertEquals(3,ml.getBeginX(),"beginn x");
    }

    @Test
    void setBeginY() {
        assertDoesNotThrow(()->ml.setBeginY(5));
        assertEquals(5,ml.getBeginY(),"beginn y");
    }

    @Test
    void getEndX() {

        assertEquals(fin.getX(),ml.getEndX(),"end x");
    }

    @Test
    void getEndY() {
        assertEquals(fin.getY(),ml.getEndY(),"end Y");
    }

    @Test
    void setEndX() {
        assertDoesNotThrow(()->ml.setEndX(4));
        assertEquals(4,ml.getEndX(),"end x");

    }

    @Test
    void setEndY() {
        assertDoesNotThrow(()->ml.setEndY(4));
        assertEquals(4,ml.getEndY(),"end y");
    }

    @Test
    void getBeginXY() {
        assertEquals(begin.getXY()[0],ml.getBeginXY()[0],"end x");
        assertEquals(begin.getXY()[1],ml.getBeginXY()[1],"end y");
    }

    @Test
    void setBeginXY() {
        assertDoesNotThrow(()->ml.setBeginXY(4,5));
        assertEquals(4,ml.getBeginX(),"end x");
        assertEquals(5,ml.getBeginY(),"end y");
    }

    @Test
    void getEndXY() {
        assertEquals(fin.getXY()[0],ml.getEndXY()[0],"end x");
        assertEquals(fin.getXY()[1],ml.getEndXY()[1],"end y");
    }

    @Test
    void setEndXY() {  assertDoesNotThrow(()->ml.setEndXY(4,5));
        assertEquals(4,ml.getEndX(),"end x");
        assertEquals(5,ml.getEndY(),"end y");

    }

    @Test
    void getLength() {
        Mypoint mp= new Mypoint(-4,-10);
        assertEquals(mp.distancia(),ml.getLength(),"lengt");
    }

    @Test
    void getGradient() {
        double esperado=Math.atan2(fin.getX()-begin.getX(),fin.getY()-begin.getY());
        assertEquals(esperado,ml.getGradient(),"gradient");
    }

    @Test
    void testToString() {
        String esperado= "MyLine[begin'=(4,5),end=(8,15)}";
        assertEquals(esperado,ml.toString(),"string");
    }
}