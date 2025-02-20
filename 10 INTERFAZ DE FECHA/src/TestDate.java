import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestDate {
    //Tests the Date class

    //test de modificar un dia válido
    @Test
    public void test1(){
        Date d = new Date();
        d.setDia(15);
        assertEquals(15, d.getDia());
    }

    //test de modificar un dia inválido
    @Test
    public void test2(){
        Date d = new Date();
        d.setDia(32);
        assertEquals(1, d.getDia());
    }

    //test de modificar un mes válido
    @Test
    public void test3(){
        Date d = new Date();
        d.setMes(5);
        assertEquals(5, d.getMes());
    }

    //test de modificar un mes inválido
    @Test
    public void test4(){
        Date d = new Date();
        d.setMes(13);
        assertEquals(1, d.getMes());
    }

    //test de modificar un año válido
    @Test
    public void test5(){
        Date d = new Date();
        d.setAño(2021);
        assertEquals(2021, d.getAño());
    }

    //test de modificar un año inválido
    @Test
    public void test6(){
        Date d = new Date();
        d.setAño(2026);
        assertEquals(1900, d.getAño());
    }

    //test de modificar una fecha válida
    @Test
    public void test7(){
        Date d = new Date();
        d.setDate(15, 5, 2021);
        assertEquals(15, d.getDia());
        assertEquals(5, d.getMes());
        assertEquals(2021, d.getAño());
    }

    //test de modificar una fecha inválida
    @Test
    public void test8(){
        Date d = new Date();
        d.setDate(32, 13, 2026);
        assertEquals(1, d.getDia());
        assertEquals(1, d.getMes());
        assertEquals(1900, d.getAño());
    }

    //test de imprimir una fecha
    @Test
    public void test9(){
        Date d = new Date();
        d.setDate(15, 5, 2021);
        assertEquals("15/5/2021", d.toString());
    }
    
}
