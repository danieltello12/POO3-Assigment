package Cuaderno_3.Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
Animal a= new Animal("dani");
    @Test
    void testToString() {
        assertEquals("Animal[name= dani]",a.toString());
    }
}