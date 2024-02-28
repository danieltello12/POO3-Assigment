package Cuaderno_2.Ejercicio2_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

Customer c= new Customer(4,"Dani",'h');
    @Test
    void getId() {
        assertEquals(4,c.getId(),"id");
    }

    @Test
    void getName() {
        assertEquals("Dani",c.getName(),"name");
    }

    @Test
    void getGender() {
        assertEquals('h', c.getGender(),"gender");
    }

    @Test
    void testToString() {
        String esperada="Customer{Dani', (4)";
    }
}