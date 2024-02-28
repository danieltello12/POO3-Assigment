package Cuaderno_2.Ejercicio2_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

Customer c=new Customer(5,"dani",5);
    @Test
    void getId() {
        assertEquals(5,c.getId(),"id");
    }

    @Test
    void getName() {
        assertEquals("dani",c.getName(),"Name");
    }

    @Test
    void getDiscount() {
        assertEquals(5,c.getDiscount(),"Discount");
    }

    @Test
    void setDiscount() {
        assertDoesNotThrow(()->c.setDiscount(6));
        assertEquals(6,c.getDiscount(),"Discount");
    }

    @Test
    void testToString() {
        String esperado="dani(5) (5%)";
        assertEquals(esperado,c.toString(),"tostring");
    }
}