package Cuaderno_2.Ejercicio2_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MycircleTest {
    Mypoint centro= new Mypoint(4,5);
    Mycircle c2= new Mycircle();
    Mycircle c3= new Mycircle(4,5,9);
Mycircle c= new Mycircle(centro,3);
    @Test
    void getCentro() {
        assertEquals(centro,c.getCentro(),"cetro");
    }

    @Test
    void getRadio() {
        assertEquals(3,c.getRadio(),"radio");
    }

    @Test
    void getCenterX() {
        assertEquals(centro.getX(),c.getCenterX(),"centro x");
    }

    @Test
    void getCentery() {
        assertEquals(centro.getY(),c.getCentery(),"centro y");
    }

    @Test
    void getXY() {
        assertEquals(centro.getX(),c.getXY()[0],"centro x");
        assertEquals(centro.getY(),c.getXY()[1],"centro y");
    }

    @Test
    void setCentro() {
        Mypoint nuevocentro =  new Mypoint(7,8);
        assertDoesNotThrow(()->c.setCentro(nuevocentro));
        assertEquals(nuevocentro,c.getCentro(),"nuevocentro");
    }

    @Test
    void setRadio() {

        assertDoesNotThrow(()->c.setRadio(9));
        assertEquals(9,c.getRadio(),"radio");

    }

    @Test
    void setCenterX() {
        assertDoesNotThrow(()->c.setCenterX(8));
        assertEquals(8,c.getCenterX(),"centro x");

    }

    @Test
    void setCenterY() {
        assertDoesNotThrow(()->c.setCenterY(9));
        assertEquals(9,c.getCentery(),"centro y");
    }

    @Test
    void setCenterXY() {
        assertDoesNotThrow(()->c.setCenterXY(2,3));
        assertEquals(2,c.getCenterX(),"centro x");
        assertEquals(3,c.getCentery(),"centro y");
    }

    @Test
    void testToString() {
        String esperado= "Mycircle[radius=3, center=(4,5)]";
        assertEquals(esperado, c.toString(),"string");
    }

    @Test
    void getArea() {
        double esperado=Math.PI*(c.getRadio()*c.getRadio());
        assertEquals(esperado,c.getArea(),"area");
    }

    @Test
    void getCircumference() {
        double esperado= Math.PI*c.getRadio()*2;
        assertEquals(esperado,c.getCircumference(),"circunferecnia");
    }

    @Test
    void distancia() {
        double esperado= centro.distance(9,8);
        Mypoint nuevo= new Mypoint(9,8);
        Mycircle nuevo2= new Mycircle(nuevo,4);
        assertEquals(esperado,c.distancia(nuevo2),"distancia");
    }
}