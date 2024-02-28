package Cuaderno_2.Ejercicio2_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Author a= new Author("Dani", "test@gmail");
    Book b2= new Book("444","testt",a,45);
Book b= new Book("22222","test",a,45.3,5);
    @Test
    void getIsbn() {
        assertEquals("22222", b.getIsbn(),"get isbn");

    }

    @Test
    void getName() {
        assertEquals("test", b.getName(),"get name");
    }

    @Test
    void getAuthor(){
        assertEquals(a, b.getAuthor(),"autor");
    }

    @Test
    void getPrice() {
        assertEquals(45.3,b.getPrice(),"precio");
    }

    @Test
    void setPrice() {
        assertDoesNotThrow(()->b.setPrice(5));
        assertEquals(5,b.getPrice(),"precio");
    }

    @Test
    void getQty() {
        assertEquals(5, b.getQty(), "qty");
    }

    @Test
    void setQty() {
        assertDoesNotThrow(()->b.setQty(4));
        assertEquals(4, b.getQty(), "qty");
    }

    @Test
    void getAuthorName() {
        assertEquals(a.getName(),b.getAuthorName(),"nombre autor");
    }

    @Test
    void testToString() {
        String esperado="Book{isbn='22222', name='test', author=Author{name='Dani', email='test@gmail'}, price=45.3, qty=5}";
        assertEquals(esperado,b.toString());
    }
}