package Cuaderno_2.Ejercicio2_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
Customer c= new Customer(5,"dani",'h');
Account a2= new Account(6,c);
Account a= new Account(4,c,45);
    @Test
    void getId() {
    assertEquals(4,a.getId(),"id");
    }

    @Test
    void testToString() {
        String esperada="{Customer{dani', (5)}'balance=45,00}";
        assertEquals( esperada,a.toString(),"string");
    }


    @Test
    void getCostumer() {
        assertEquals(c,a.getCostumer(),"customer");
    }

    @Test
    void getBalance() {
        assertEquals(45,a.getBalance(),"balance");
    }

    @Test
    void getCostumerName() {
        assertEquals(c.getName(),a.getCostumerName(),"customer name");
    }

    @Test
    void deposit() {
        assertDoesNotThrow(()-> a.deposit(5));
        assertEquals(50,a.getBalance());
    }

    @Test
    void setBalance() {
        assertDoesNotThrow(()-> a.setBalance(50));
        assertEquals(50,a.getBalance());
    }

    @Test
    void withdraw() {
        assertDoesNotThrow(()->a.withdraw(46));
        assertEquals(45,a.getBalance(),"witdraw");
        assertDoesNotThrow(()->a.withdraw(40));
        assertEquals(5,a.getBalance(),"witdraw");
    }
}