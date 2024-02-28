package Cuaderno_3.Ejercicio3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s= new Student("Dani","Villalbilla", "Ciencias",18,1.5);

    @Test
    void getProgram() {
        assertEquals("Ciencias",s.getProgram(),"program");
    }

    @Test
    void setProgram() {
        assertDoesNotThrow(()->s.setProgram("Letras"));
        assertEquals("Letras",s.getProgram(),"set program");

    }

    @Test
    void getYear() {
        assertEquals(18,s.getYear(),"año");
    }

    @Test
    void setYear() {
        assertDoesNotThrow(()->s.setYear(13));
        assertEquals(13,s.getYear(),"set año");
    }

    @Test
    void getFee() {
        assertEquals(1.5,s.getFee(),"fee");
    }

    @Test
    void setFee() {
        assertDoesNotThrow(()->s.setFee(5.3));
        assertEquals(5.3,s.getFee(),"set fee");
    }

    @Test
    void testToString() {
        String esperado="Student[Person[ name= Dani, address=Villalbilla], program=Ciencias, year=18, fee=1.5]";
        assertEquals(esperado,s.toString(),"string");
    }
}