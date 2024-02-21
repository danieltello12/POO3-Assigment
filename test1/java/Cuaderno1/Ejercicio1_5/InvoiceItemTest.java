package Cuaderno1.Ejercicio1_5;

import Cuaderno_1.Ejercicio1_5.InvoiceItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem miObjeto= new InvoiceItem("34","34",4,1.8);
        assertEquals("34",miObjeto.getId(), "Ha sacado un ID erroneo");
    }

    @Test
    void getDesc() {
        InvoiceItem miObjeto= new InvoiceItem("34","34",4,1.8);
        assertEquals("34",miObjeto.getDesc(), "Ha sacado un desc erroneo");
    }

    @Test
    void getQty() {
        InvoiceItem miObjeto= new InvoiceItem("34","34",4,1.8);
        assertEquals(4,miObjeto.getQty(), "Ha sacado un qty erroneo");
    }
    @Test
    void setQty() {
        InvoiceItem miObjeto= new InvoiceItem("34","34",4,1.8);
        assertDoesNotThrow(()->miObjeto.setQty(16) );
        assertEquals(16,miObjeto.getQty(), "Ha colocado un qty erroneo");

    }

    @Test
    void getUnitPrice() {
        InvoiceItem miObjeto= new InvoiceItem("34","34",4,1.8);
        assertEquals(1.8,miObjeto.getUnitPrice(), "Ha sacado un precio por unidad erroneo");
    }

    @Test
    void setUnitPrice() {
        InvoiceItem miObjeto= new InvoiceItem("34","34",4,1.8);
        assertDoesNotThrow(()->miObjeto.setUnitPrice(2.96) );
        assertEquals(2.96,miObjeto.getUnitPrice(), "Ha colocado un precio erroneo");
    }

    @Test
    void getTotal() {
        InvoiceItem miObjeto= new InvoiceItem("34","34",4,1.8);
        int x= miObjeto.getQty();
        double y =miObjeto.getUnitPrice();
        double esperado=x*y;
        assertEquals(esperado,miObjeto.getTotal(), "Ha colocado un precio total erroneo");

    }
    @Test
    void testToString() {
        InvoiceItem miObjeto= new InvoiceItem("34","34",4,1.8);
        String salidaEsperada="InvoiceItem[id=34 desc=34 qty=4 unit price=1.8]";
        assertEquals(salidaEsperada,miObjeto.toString(),"No sale el mismo texto en toString");
    }
}