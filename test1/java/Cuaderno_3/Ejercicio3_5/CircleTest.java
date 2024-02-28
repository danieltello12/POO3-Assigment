package Cuaderno_3.Ejercicio3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle  c2= new Circle(4);
    Circle c= new Circle(4,"rojo",true);

    @Test
    void getRadius() {
        assertEquals(4,c.getRadius(),"radio");
    }

    @Test
    void setRadius() {
        assertDoesNotThrow(()->c.setRadius(8));
        assertEquals(8,c.getRadius(),"set radio");
    }

    @Test
    void getArea() {
        double esperdo= Math.PI*4*4;
        assertEquals(esperdo,c.getArea(),"Area");
    }

    @Test
    void getPerimeter() {
        double esperado= Math.PI*4*2;
        assertEquals(esperado,c.getPerimeter(),"Circufnerencia");
    }

    @Test
    void testToString() {
        String esperado="Circle: Shape[color='rojo', filled=true] , radio=4.0";
    assertEquals(esperado,c.toString(),"string");
    }
}