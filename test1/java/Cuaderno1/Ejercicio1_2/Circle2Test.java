package Cuaderno1.Ejercicio1_2;

import Cuaderno_1.Ejercicio1_2.Circle2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    @Test
    void getRadio() {
        Circle2 miObjeto=new Circle2(3d);
        assertEquals(3d,miObjeto.getRadio(),"No ha devuelto el radio adecuado");
    }

    @Test
    void setRadio() {
        Circle2 miObjeto=new Circle2(3d);
        miObjeto.setRadio(5d);
        assertDoesNotThrow(()->miObjeto.setRadio(5d));
        assertEquals(5d,miObjeto.getRadio(),"No ha devuelto el radio adecuado");

    }

    @Test
    void getArea() {
        Circle2 miObjeto=new Circle2(4d);
        double area= 4*4*Math.PI;
        assertEquals(area,miObjeto.getArea());
    }

    @Test
    void getCircunferencia() {
        Circle2 miObjeto=new Circle2(4d);
        double circunferencia= 2*4*Math.PI;
        assertEquals(circunferencia,miObjeto.getCircunferencia());

    }

    @Test
    void testToString() {
        double radius=4.3d;
        Circle2 s=new Circle2();
        s.setRadio(radius);
        String salidaEsperada="Circle[radius:4.3]";
        assertEquals(salidaEsperada,s.toString(),"No sale el mismo texto en toString");
    }
}