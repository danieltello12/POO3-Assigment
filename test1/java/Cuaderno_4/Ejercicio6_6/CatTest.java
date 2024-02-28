package Cuaderno_4.Ejercicio6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
Cat c= new Cat("lucia");
    @Test
    void greets() {
        assertDoesNotThrow(()->c.greets());
    }
}