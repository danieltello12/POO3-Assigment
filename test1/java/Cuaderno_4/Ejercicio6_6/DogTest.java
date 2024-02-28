package Cuaderno_4.Ejercicio6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
Dog d= new Dog("Kiara");
Dog d2= new Dog("Lucky");
    @Test
    void greets() {
        assertDoesNotThrow(()->d.greets());
    }

    @Test
    void testGreets() {
        assertDoesNotThrow(()->d.greets(d2));
    }
}