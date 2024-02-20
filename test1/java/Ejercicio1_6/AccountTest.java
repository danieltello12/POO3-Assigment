package Ejercicio1_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account miObjeto= new Account("34","Dani",5);
        assertEquals("34",miObjeto.getId(),"Ha sacado un ID erroneo");
    }

    @Test
    void getName() {
        Account miObjeto= new Account("34","Dani",5);
        assertEquals("Dani",miObjeto.getName(),"Ha sacado un nombre erroneo");
    }

    @Test
    void getBalance() {
        Account miObjeto= new Account("34","Dani",5);
        assertEquals(5,miObjeto.getBalance(),"Ha sacado un balance erroneo");
    }

    @Test
    void credit() {
        Account miObjeto= new Account("34","Dani",5);
        int x= miObjeto.getBalance();
        int esperado= x+15;
        assertDoesNotThrow(()->miObjeto.credit(15));
        assertEquals(esperado,miObjeto.getBalance(), "Ha hecho mal el credito");
    }

    @Test
    void debit() {
        Account miObjeto= new Account("34","Dani",5);
        int x= miObjeto.getBalance();
        int esperado= x-3;
        assertDoesNotThrow(()->miObjeto.debit(15));
        assertEquals(x,miObjeto.getBalance(), "Ha hecho mal el credito");
        assertDoesNotThrow(()->miObjeto.debit(3));
        assertEquals(esperado,miObjeto.getBalance(), "Ha hecho mal el credito");
    }

    @Test
    void transferTo() {
        Account miObjeto= new Account("34","Dani",5);
        Account destino=new Account("35","Lucia",15);
        int x= miObjeto.getBalance();
        int y=destino.getBalance();
        int esperado= x-3;
        int esperadodestino= y+3;
        assertDoesNotThrow(()->miObjeto.transferTo(destino,15));
        assertEquals(x,miObjeto.getBalance(), "Ha hecho mal la transferencia");
        assertEquals(y,destino.getBalance(), "Ha hecho mal la transferencia");
        assertDoesNotThrow(()->miObjeto.transferTo(destino,3));
        assertEquals(esperado,miObjeto.getBalance(), "Ha hecho mal la transferencia");
        assertEquals(esperadodestino,destino.getBalance(), "Ha hecho mal la transferencia");
    }

    @Test
    void testToString() {
        Account miObjeto= new Account("34","Dani",5);
        String salidaEsperada="Account[id=34, name=Dani, balance=5]";
        assertEquals(salidaEsperada,miObjeto.toString(),"No sale el mismo texto en toString");
    }
}