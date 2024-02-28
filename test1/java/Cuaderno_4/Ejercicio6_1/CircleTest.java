package Cuaderno_4.Ejercicio6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
Circle c= new Circle(4);
Circle c2= new Circle(4,"red",true);
    @Test
    void getRadius() {
        assertEquals(4,c.getRadius());
    }

    @Test
    void setRadius() {
        assertDoesNotThrow(()->c.setRadius(5));
        assertEquals(5,c.getRadius());
    }

    @Test
    void getArea() {
        assertEquals((Math.PI*4*4),c.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(Math.PI*4*2,c.getPerimeter());
    }

    @Test
    void testToString() {
        String esperado="Circle: Shape[color='red', filled=true] , radio=4.0";
        assertEquals(esperado,c2.toString());
    }
}