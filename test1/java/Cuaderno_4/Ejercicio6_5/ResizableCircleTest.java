package Cuaderno_4.Ejercicio6_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {
ResizableCircle c = new ResizableCircle(4);
    @Test
    void resize() {
        assertDoesNotThrow(()->c.resize(5));
        assertEquals(0.2,c.radius);

    }

    @Test
    void testToString() {
String esperado= "ResizableCircle Circle[radio=4.0]";
assertEquals(esperado,c.toString());
    }
}