package Cuaderno1.Ejercicio1_8;

import Cuaderno_1.Ejercicio1_8.ClaseTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaseTimeTest {

    @Test
    void getHour() {
        ClaseTime miObjeto= new ClaseTime(2,50,30);
        assertEquals(2,miObjeto.getHour(),"Ha sacado mal la hora");
    }

    @Test
    void getMinute() {
        ClaseTime miObjeto= new ClaseTime(2,50,30);
        assertEquals(50,miObjeto.getMinute(),"Ha sacado mal el minuto");
    }

    @Test
    void getSecond() {
        ClaseTime miObjeto= new ClaseTime(2,50,30);
        assertEquals(30,miObjeto.getSecond(),"Ha sacado mal el segundo");
    }

    @Test
    void setHour() {
        ClaseTime miObjeto= new ClaseTime(2,50,30);
        assertDoesNotThrow(()->miObjeto.setHour(5));
        assertEquals(5,miObjeto.getHour(),"Ha puesto mal la hora");
    }

    @Test
    void setMinute() {
        ClaseTime miObjeto= new ClaseTime(2,50,30);
        assertDoesNotThrow(()->miObjeto.setMinute(53));
        assertEquals(53,miObjeto.getMinute(),"Ha puesto mal el minuto");
    }

    @Test
    void setSecond() {
        ClaseTime miObjeto= new ClaseTime(2,50,30);
        assertDoesNotThrow(()->miObjeto.setSecond(45));
        assertEquals(45,miObjeto.getSecond(),"Ha puesto mal los segundos");
    }

    @Test
    void setTime() {
        ClaseTime miObjeto= new ClaseTime(2,50,30);
        assertDoesNotThrow(()->miObjeto.setTime(3,53,5));
        assertEquals(3, miObjeto.getHour(),"Ha sacado mal la hora");
        assertEquals(53, miObjeto.getMinute(),"Ha sacado mal el minuto");
        assertEquals(5,miObjeto.getSecond(),"Ha sacado mal los segundos");

    }

    @Test
    void testToString() {
        ClaseTime miObjeto= new ClaseTime(2,50,30);
        String salidaEsperada="02:50:30";
        assertEquals(salidaEsperada,miObjeto.toString(),"No sale el mismo texto en toString");
    }

    @Test
    void nextSecond() {
        ClaseTime miObjeto= new ClaseTime(2,50,30);
        assertDoesNotThrow(()->miObjeto.nextSecond());
        assertEquals(31,miObjeto.getSecond(),"Ha sacado mal el siguiente segundo");

    }

    @Test
    void previusSecond() {
        ClaseTime miObjeto= new ClaseTime(2,50,30);
        assertDoesNotThrow(()->miObjeto.previusSecond());
        assertEquals(29,miObjeto.getSecond(),"Ha sacado mal el segundo anterior");
    }
}