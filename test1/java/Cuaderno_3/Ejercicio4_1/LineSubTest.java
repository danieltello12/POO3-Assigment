package Cuaderno_3.Ejercicio4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {
    Point begin = new Point(4,5);
    Point fin= new Point(8,15);
    LineSub ml= new LineSub(begin,fin);
    LineSub ml1= new LineSub(4,5,6,8);
    @Test
    void testToString() {
        String esperdo= "Las coordenadas son: begin=(4,5)end= (8,15)";
        assertEquals(esperdo,ml.toString(),"String");
    }

    @Test
    void getBegin() {
        assertEquals(begin.getX(),ml.getBegin().getX(),"begin");
        assertEquals(begin.getY(),ml.getBegin().getY());
    }

    @Test
    void getEnd() {
        assertEquals(fin.getX(),ml.getEnd().getX(),"end");
        assertEquals(fin.getY(),ml.getEnd().getY());
    }

    @Test
    void setBegin() {
        assertDoesNotThrow(()->ml.setBegin(4,5));
        assertEquals(4,ml.getBeginX(),"set begin x");
        assertEquals(5,ml.getBeginY(),"set begin y");
    }

    @Test
    void setEnd() {
        assertDoesNotThrow(()->ml.setEnd(6,8));
        assertEquals(6,ml.getEndX(),"set end");
        assertEquals(8,ml.getEndY(),"set end");
    }

    @Test
    void getBeginX() {
        assertEquals(4,ml.getBeginX(),"begin x");
    }

    @Test
    void getBeginY() {
        assertEquals(5,ml.getBeginY(),"begin y");
    }

    @Test
    void getEndX() {
        assertEquals(8,ml.getEndX(),"end x");
    }

    @Test
    void getEndY() {
        assertEquals(15,ml.getEndY(),"end y");
    }

    @Test
    void setBeginX() {
        assertDoesNotThrow(()->ml.setBeginX(6));
        assertEquals(6,ml.getBeginX(),"begin x");
    }

    @Test
    void setBeginY() {assertDoesNotThrow(()->ml.setBeginY(6));
        assertEquals(6,ml.getBeginY(),"begin y");

    }

    @Test
    void setBeginXY() {
        assertDoesNotThrow(()->ml.setBeginXY(8,9));
        assertEquals(8,ml.getBeginX());
        assertEquals(9,ml.getBeginY());

    }

    @Test
    void setEndX() {
        assertDoesNotThrow(()->ml.setEndX(6));
        assertEquals(6,ml.getEndX(),"end x");
    }

    @Test
    void setEndY() {
        assertDoesNotThrow(()->ml.setEndY(6));
        assertEquals(6,ml.getEndY(),"end y");

    }

    @Test
    void setEndXY() {
        assertDoesNotThrow(()->ml.setEndXY(4,9));
        assertEquals(4,ml.getEndX());
        assertEquals(9,ml.getEndY());
    }

    @Test
    void getLength() {
        double x= fin.getX()-begin.getX();
        double y= fin.getY()-begin.getY();
        assertEquals(Math.sqrt(x*x+y*y),ml.getLength());
    }

    @Test
    void getGradient() {
        double x= fin.getX()-begin.getX();
        double y= fin.getY()-begin.getY();
        assertEquals(Math.atan2(x,y),ml.getGradient());

    }
}