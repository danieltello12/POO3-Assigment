package Cuaderno_3.Ejercicio3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {
Point3D p= new Point3D();
    Point3D p1= new Point3D(4,5,6);
    @Test
    void getZ() {
        assertEquals(6,p1.getZ(),"z");
    }

    @Test
    void setZ() {
        assertDoesNotThrow(()->p1.setZ(5));
        assertEquals(5,p1.getZ(),"z");
    }

    @Test
    void setXYZ() {
        assertDoesNotThrow(()->p1.setXYZ(3,2,9));
        assertEquals(9,p1.getZ(),"z");
        assertEquals(3,p1.getX(),"x");
        assertEquals(2,p1.getY(),"y");
    }

    @Test
    void getXYZ() {
        assertEquals(4, p1.getXYZ()[0]);
        assertEquals(5,p1.getXYZ()[1]);
        assertEquals(6,p1.getXYZ()[2]);
    }

    @Test
    void testToString() {
        String esperado="Point3D: x=4.0, y=5.0  z=6.0";
        assertEquals(esperado,p1.toString());
    }
}