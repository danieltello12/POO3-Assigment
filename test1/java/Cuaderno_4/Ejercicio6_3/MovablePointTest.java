package Cuaderno_4.Ejercicio6_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
MovablePoint mp= new MovablePoint(4,5,7,8);
    @Test
    void testToString() {
String esperado= "(4,5), Speed= (7,8)";
assertEquals(esperado,mp.toString());
    }

    @Test
    void moveDown() {
        assertDoesNotThrow(()->mp.MoveDown());
        assertEquals(5-8,mp.y);
    }

    @Test
    void moveUP() {
        assertDoesNotThrow(()->mp.MoveUP());
        assertEquals(5+8,mp.y);
    }

    @Test
    void moveLeft() {
        assertDoesNotThrow(()->mp.MoveLeft());
        assertEquals(4-7,mp.x);
    }

    @Test
    void moveRight() { assertDoesNotThrow(()->mp.MoveRight());
        assertEquals(4+7,mp.x);

    }
}