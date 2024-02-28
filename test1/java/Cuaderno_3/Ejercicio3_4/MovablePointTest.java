package Cuaderno_3.Ejercicio3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint mp1= new MovablePoint();
    MovablePoint mp2= new MovablePoint(3,4);
MovablePoint mp= new MovablePoint(4,5,8,6);
    @Test
    void getxSpeed() {
        assertEquals(8, mp.getxSpeed(),"sxspeed");
    }

    @Test
    void setxSpeed() {
        assertDoesNotThrow(()->mp.setxSpeed(2));
        assertEquals(2,mp.getxSpeed(),"set xspeed");
    }

    @Test
    void getySpeed() {
        assertEquals(6,mp.getySpeed(),"yspeed");
    }

    @Test
    void setySpeed() {
        assertDoesNotThrow(()->mp.setySpeed(2));
        assertEquals(2,mp.getySpeed(),"set yspeed");
    }

    @Test
    void setSpeed() {
        assertDoesNotThrow(()->mp.setSpeed(5,6));
        assertEquals(6,mp.getySpeed(),"yspeed");
        assertEquals(5,mp.getxSpeed(),"set xspeed");

    }

    @Test
    void getSpeed() {
        assertEquals(mp.getxSpeed(),mp.getSpeed()[0],"xspeed");
        assertEquals(mp.getySpeed(),mp.getSpeed()[1]);
    }

    @Test
    void testToString() {
        String esperado="(4.0,5.0)speed(8.0,6.0)";
        assertEquals(esperado, mp.toString());
    }
}