package Cuaderno1.Ejercicio1_3;

import Cuaderno_1.Ejercicio1_3.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle miOBjeto= new Rectangle();
        assertEquals(2.5f, miOBjeto.getLength(),"No ha devuelto la longitud adecuada");
    }

    @Test
    void setLength() {
        Rectangle miOBjeto= new Rectangle();
        miOBjeto.setLength(3f);
        assertDoesNotThrow(()-> miOBjeto.setLength(3f));
        assertEquals(3f, miOBjeto.getLength(),"No ha colocado la longitud adecuada");
    }

    @Test
    void getWidth() {
        Rectangle miOBjeto= new Rectangle();
        assertEquals(3.4f, miOBjeto.getWidth(),"No ha devuelto el ancho adecuado");
    }

    @Test
    void setWidth() {
        Rectangle miOBjeto= new Rectangle();
        miOBjeto.setWidth(4f);
        assertDoesNotThrow(()-> miOBjeto.setWidth(4f));
        assertEquals(4f,miOBjeto.getWidth(),"Ha colocado mal el ancho");
    }

    @Test
    void getArea() {
        Rectangle miOBjeto= new Rectangle();
        double x=miOBjeto.getLength();
        double y= miOBjeto.getWidth();
        double area=x*y;
        assertEquals(area,miOBjeto.getArea(),"Ha calculado mal el area");
    }

    @Test
    void getPerimetrer() {
        Rectangle miOBjeto= new Rectangle();
        double x=miOBjeto.getLength();
        double y= miOBjeto.getWidth();
        assertEquals(x+x+y+y,miOBjeto.getPerimetrer(),"Ha calculado mal el perimetro");

    }

    @Test
    void testToString() {
        Rectangle miOBjeto= new Rectangle();
        String salidaEsperada="Rectángulo[altura=2.5 anchura=3.4]";
        assertEquals(salidaEsperada,miOBjeto.toString(),"No sale el mismo texto en toString");
    }
}