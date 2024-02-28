package Cuaderno_4.Ejercicio6_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {
MovableCircle c= new MovableCircle(4,5,6,6,8);
MovablePoint centro= new MovablePoint(4,5,6,6);
    @Test
    void testToString() {
        String esperado="(4,5), Speed= (6,6)radio 8";
        assertEquals(esperado,c.toString());
    }

    @Test
    void moveLeft() {
        assertDoesNotThrow(()->centro.MoveLeft());
        assertDoesNotThrow(()->c.MoveLeft());
        assertEquals(centro.x,c.centro.x);
    }

    @Test
    void moveUP() {
        assertDoesNotThrow(()->centro.MoveUP());
        assertDoesNotThrow(()->c.MoveUP());
        assertEquals(centro.y,c.centro.y);
    }

    @Test
    void moveDown() {
        assertDoesNotThrow(()->centro.MoveDown());
        assertDoesNotThrow(()->c.MoveDown());
        assertEquals(centro.y,c.centro.y);
    }

    @Test
    void moveRight() {
        assertDoesNotThrow(()->centro.MoveRight());
        assertDoesNotThrow(()->c.MoveRight());
        assertEquals(centro.x,c.centro.x);
    }
}