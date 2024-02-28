package Cuaderno_3.Ejercicio3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Shape s2= new Shape();
    Shape s= new Shape("rojo",true);
    @Test
    void getColor() {
        assertEquals("rojo",s.getColor(),"color");
    }

    @Test
    void setColor() {
        assertDoesNotThrow(()->s.setColor("azul"));
        assertEquals("azul",s.getColor()," set color");
    }

    @Test
    void isFilled() {
        assertTrue(s.isFilled(), "is filled");
    }

    @Test
    void setFilled() {
        assertDoesNotThrow(()->s.setFilled(false));
        assertFalse(s.isFilled(),"set filled");
    }

    @Test
    void testToString() {
        String esperado="Shape[color='rojo', filled=true]";
    }
}