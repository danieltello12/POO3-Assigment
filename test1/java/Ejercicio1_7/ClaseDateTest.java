package Ejercicio1_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaseDateTest {

    @Test
    void getDay() {
        ClaseDate miObjeto=new ClaseDate(2,6,1935);
        assertEquals(2, miObjeto.getDay(),"Ha sacado mal el dia");
    }

    @Test
    void getMonth() {
        ClaseDate miObjeto=new ClaseDate(2,6,1935);
        assertEquals(6, miObjeto.getMonth(),"Ha sacado mal el mes");
    }

    @Test
    void getYear() {
        ClaseDate miObjeto=new ClaseDate(2,6,1935);
        assertEquals(1935,miObjeto.getYear(),"Ha sacado mal el año");
    }

    @Test
    void setDay() {
        ClaseDate miObjeto=new ClaseDate(2,6,1935);
        assertDoesNotThrow(()->miObjeto.setDay(5));
        assertEquals(5,miObjeto.getDay(),"Ha colocado mal el día");
    }

    @Test
    void setMonth() {
        ClaseDate miObjeto=new ClaseDate(2,6,1935);
        assertDoesNotThrow(()->miObjeto.setMonth(5));
        assertEquals(5,miObjeto.getMonth(),"Ha colocado mal el mes");
    }

    @Test
    void setYear() {
        ClaseDate miObjeto=new ClaseDate(2,6,1935);
        assertDoesNotThrow(()->miObjeto.setMonth(1956));
        assertEquals(1956,miObjeto.getMonth(),"Ha colocado mal el año");

    }

    @Test
    void setDate() {
        ClaseDate miObjeto=new ClaseDate(2,6,1935);
        assertDoesNotThrow(()->miObjeto.setDate(3,5,2005));
        assertEquals(3, miObjeto.getDay(),"Ha sacado mal el dia");
        assertEquals(5, miObjeto.getMonth(),"Ha sacado mal el mes");
        assertEquals(2005,miObjeto.getYear(),"Ha sacado mal el año");


    }

    @Test
    void testToString() {
        ClaseDate miObjeto=new ClaseDate(2,6,1935);
       String salidaEsperada="02/06/1935";
        assertEquals(salidaEsperada,miObjeto.toString(),"No sale el mismo texto en toString");
    }
}