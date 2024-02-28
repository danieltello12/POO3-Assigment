package Cuaderno_2.Ejercicio2_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {
    Mypoint V1= new Mypoint(4,5);
    Mypoint V2= new Mypoint(8,9);
    Mypoint V3= new Mypoint(10,6);
    MyTriangle t= new MyTriangle(V1,V2,V3);
    MyTriangle t2= new MyTriangle(1,2,3,4,5,6);
    @Test
    void testToString() {
        String esperado="MyTriangle[v1=(4,5), v2=(8,9),v3=(10,6)]";
        assertEquals(esperado,t.toString(),"string");
    }

    @Test
    void getPerimeter() {
        double lado1=V1.distancia(V2);
        double lado2=V1.distancia(V3);
        double lado3=V2.distancia(V3);
        assertEquals(lado1+lado2+lado3,t.getPerimeter(),"area");
    }

    @Test
    void getType() {
        assertEquals("Escaleno",t.getType(),"tipo");
        MyTriangle t2= new MyTriangle(2,2,4,5,6,2);
        assertEquals("Isosceles",t2.getType());
        MyTriangle t3= new MyTriangle(1,2,1,2,1,2);
        assertEquals("Equilatero",t3.getType());
    }
}