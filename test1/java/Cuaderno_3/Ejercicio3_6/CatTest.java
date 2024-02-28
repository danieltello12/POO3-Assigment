package Cuaderno_3.Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
Cat c= new Cat("Lucia");
    @Test
    void greets() {
        assertDoesNotThrow(()->c.greets());
    }

    @Test
    void testToString() {
        String esperoado="Cat[Mammal[Animal[name= Lucia]]]";
        assertEquals(esperoado,c.toString());
    }
}