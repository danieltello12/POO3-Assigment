package Ejercicio1_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee miObjeto=new Employee(2,"Dani","Tello",455);
        assertEquals(2,miObjeto.getId(),"Ha sacado un ID erroneo");
    }

    @Test
    void getprimerNombre() {
        Employee miObjeto=new Employee(2,"Dani","Tello",455);
        assertEquals("Dani",miObjeto.getprimerNombre(),"Ha sacado un primer nombre erroneo");

    }

    @Test
    void getSegundoNombre() {
        Employee miObjeto=new Employee(2,"Dani","Tello",455);
        assertEquals("Tello",miObjeto.getSegundoNombre(),"Ha sacado un segundo nombre erroneo");
    }

    @Test
    void getName() {
        Employee miObjeto=new Employee(2,"Dani","Tello",455);
        assertEquals("Dani Tello",miObjeto.getName(),"Ha sacado un nombre erroneo");
    }

    @Test
    void getSalary() {
        Employee miObjeto=new Employee(2,"Dani","Tello",455);
        assertEquals(455,miObjeto.getSalary(),"Ha sacado un salario erroneo");
    }
    @Test
    void setSalary() {
        Employee miObjeto=new Employee(2,"Dani","Tello",455);
        assertDoesNotThrow(()->miObjeto.setSalary(500) );
        assertEquals(500,miObjeto.getSalary(),"Ha colocado un salario erroneo");
    }

    @Test
    void getAnnualSalary() {
        Employee miObjeto=new Employee(2,"Dani","Tello",455);
        int x = miObjeto.getSalary();
        int salarioesperado= 12*x;
        assertEquals(salarioesperado,miObjeto.getAnnualSalary(),"Ha colocado un salario erroneo");
    }

    @Test
    void raiseSalary() {
        Employee miObjeto=new Employee(2,"Dani","Tello",455);
        int x= miObjeto.getSalary();
        int subida= 10;
        int nuevoSalario=((x*subida)/100)+x;
        assertEquals(nuevoSalario,miObjeto.raiseSalary(10),"Ha subido mal el salario");
    }

    @Test
    void testToString() {
        Employee miObjeto=new Employee(2,"Dani","Tello",455);
        String salidaEsperada="Employee[id=2,name=Dani Tello,salary=455]";
        assertEquals(salidaEsperada,miObjeto.toString(),"No sale el mismo texto en toString");
    }
}