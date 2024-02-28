package Cuaderno_3.Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
Dog d= new Dog("Kiara");

    @Test
    void greet() {
        assertDoesNotThrow(()->d.greet());
    }

    @Test
    void greets() {
        Dog d2= new Dog("lucky");
        assertDoesNotThrow(()->d.greets(d2));

    }

    @Test
    void testToString() {
        String esperado= "Dog[Mammal[Animal[name= Kiara]]]";
        assertEquals(esperado,d.toString(),"string");
    }
}