package Cuaderno_2.Ejercicio2_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Customer c=new Customer(5,"dani",5);
    Invoice i=new Invoice(45,c,5.3);
    @Test
    void getId() {
        assertEquals(45,i.getId(),"id");
    }

    @Test
    void getCustomer() {
        assertEquals(c,i.getCustomer(),"Customer");
    }

    @Test
    void getAmount() {
        assertEquals(5.3,i.getAmount(),"amount");
    }

    @Test
    void setCustomer() {
        Customer c2= new Customer(4,"lucia",5);
        assertDoesNotThrow(()->i.setCustomer(c2));
        assertEquals(c2,i.getCustomer(),"Customer");
    }

    @Test
    void setAmount() {
        assertDoesNotThrow(()->i.setAmount(5));
        assertEquals(5,i.getAmount(),"Amount");
    }

    @Test
    void getCustomerId() {
        assertEquals(c.getId(),i.getCustomerId(),"id customer");
    }

    @Test
    void getCustomerName() {
        assertEquals(c.getName(),i.getCustomerName(),"nombre customer");
    }

    @Test
    void getCustomerDiscount() {
        assertEquals(c.getDiscount(),i.getCustomerDiscount(),"CustomerDiscount");
    }

    @Test
    void getAmountAfterDiscount() {
        assertEquals(5.3-(5.3*((double) 5 /100)),i.getAmountAfterDiscount(),"afterdiscount");
    }

    @Test
    void testToString() {
        String esperado="Invoice[Id45, customer=dani(5) (5%), amount=5.3]";
        assertEquals(esperado,i.toString(),"string");
    }
}