package Cuaderno_3.Ejercicio3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p= new Person("Dani", "alcala");

    @Test
    void getName() {
        assertEquals("Dani",p.getName(),"nombre");
    }

    @Test
    void getAdress() {
        assertEquals("alcala",p.getAdress(),"adrees");
    }

    @Test
    void setAdress() {
        assertDoesNotThrow(()->p.setAdress("Villalbilla"));
        assertEquals("Villalbilla",p.getAdress(),"adrees");
    }

    @Test
    void testToString() {
        String esperado="Person[ name= Dani, address=alcala]";

    }
}