package Cuaderno_3.Ejercicio4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    Point begin = new Point(4,5);
    Point fin= new Point(8,15);
    Line ml= new Line(begin,fin);
    Line ml2= new Line(4,5,8,9);

    @Test
    void testToString() {
        String esperado= "x1,y1=(4,5) x2,y2= (8,15)";
        assertEquals(esperado,ml.toString(),"string");
    }

    @Test
    void getBegin() {assertEquals(begin,ml.getBegin(),"begin");
    }

    @Test
    void getEnd() {assertEquals(fin,ml.getEnd(),"end");
    }

    @Test
    void setBegin() {assertDoesNotThrow(()->ml.setBegin(fin));
        assertEquals(fin,ml.getBegin(),"set begin");
    }

    @Test
    void setEnd() {assertDoesNotThrow(()->ml.setEnd(begin));
        assertEquals(begin,ml.getEnd(),"set end");
    }

    @Test
    void getBeginX() {assertEquals(begin.getX(),ml.getBeginX(),"beginn x");
    }

    @Test
    void getBeginY() {assertEquals(begin.getY(),ml.getBeginY(),"beginn y");
    }

    @Test
    void getEndX() {assertEquals(fin.getX(),ml.getEndX(),"end x");
    }

    @Test
    void getEndY() {assertEquals(fin.getY(),ml.getEndY(),"end Y");
    }

    @Test
    void setBeginX() {assertDoesNotThrow(()->ml.setBeginX(3));
        assertEquals(3,ml.getBeginX(),"beginn x");
    }

    @Test
    void setBeginY() {assertDoesNotThrow(()->ml.setBeginY(5));
        assertEquals(5,ml.getBeginY(),"beginn y");
    }

    @Test
    void setBeginXY() {
        assertDoesNotThrow(()->ml.setBeginXY(4,6));
        assertEquals(begin.getXY()[0],ml.getBeginX(),"end x");
        assertEquals(begin.getXY()[1],ml.getBeginY(),"end y");
    }

    @Test
    void setEndX() { assertDoesNotThrow(()->ml.setEndX(4));
        assertEquals(4,ml.getEndX(),"end x");
    }

    @Test
    void setEndY() {assertDoesNotThrow(()->ml.setEndY(4));
        assertEquals(4,ml.getEndY(),"end y");
    }

    @Test
    void setEndXY() {assertDoesNotThrow(()->ml.setEndXY(4,5));
        assertEquals(4,ml.getEndX(),"end x");
        assertEquals(5,ml.getEndY(),"end y");
    }

    @Test
    void getLength() {
        double x=fin.getX()-begin.getX();
        double y=fin.getX()-begin.getY();
        assertEquals(Math.sqrt(x*x+y*y),ml.getLength(),"lengt");
    }

    @Test
    void getGradient() {
        double xdiff=fin.getX()-begin.getX();
        double ydiff=fin.getX()-begin.getY();
        double esperado= Math.atan2(xdiff,ydiff);
        assertEquals(esperado,ml.getGradient(),"gradient");
    }
}