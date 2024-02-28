package Cuaderno_3.Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {
    Mammal m= new Mammal("vaca");

    @Test
    void testToString() {
        assertEquals("Mammal[Animal[name= vaca]]",m.toString());
    }
}