package Cuaderno_2.Ejercicio2_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

Author a= new Author("Dani", "test@gmail.com");
    @Test
    void getName() {
        assertEquals("Dani", a.getName(),"get name");
    }

    @Test
    void getEmail() {
        assertEquals("test@gmail.com", a.getEmail(),"get mail");
    }

    @Test
    void setEmail() {
        assertDoesNotThrow(()->a.setEmail("nuevoemail@gmail.com"));
        assertEquals("nuevoemail@gmail.com", a.getEmail(),"set mail");
    }

    @Test
    void testToString() {
        String esperada="Author{name='Dani', email='test@gmail.com'}";
        assertEquals(esperada, a.toString());
    }
}