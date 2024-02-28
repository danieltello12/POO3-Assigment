package Cuaderno_3.Ejercicio3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    Staff st= new Staff("Dani","villalbilla","don pelayo",50);

    @Test
    void getSchool() {
        assertEquals("don pelayo",st.getSchool(),"school");
    }

    @Test
    void getPay() {
        assertEquals(50,st.getPay(),"pay");
    }

    @Test
    void setSchool() {
        assertDoesNotThrow(()->st.setSchool("peñas albas"));
        assertEquals("peñas albas", st.getSchool(),"set school");
    }

    @Test
    void setPay() {
        assertDoesNotThrow(()->st.setPay(89));
        assertEquals(89, st.getPay(),"set pay");
    }

    @Test
    void testToString() {
        String esperado="StaffPerson[ name= Dani, address=villalbilla], school=don pelayo, pay=50.0]";
        assertEquals(esperado,st.toString(),"string");
    }
}