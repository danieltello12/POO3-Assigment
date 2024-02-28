package Cuaderno_4.Ejercicio6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {
BigDog bd= new BigDog("Kiara");
BigDog bd2= new BigDog("Lucky");
Dog d= new Dog("dani");

    @Test
    void greets() {
        assertDoesNotThrow(()->bd.greets());
    }

    @Test
    void testGreets() {
        assertDoesNotThrow(()->bd.greets(bd2));
    }

    @Test
    void testGreets1() {
        assertDoesNotThrow(()->bd.greets(d));
    }
}