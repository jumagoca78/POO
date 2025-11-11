import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDate {

    @Test
    //probar el cambio de dia de 31 de enero a 1 de febrero
    public void testSiguienteDia1(){
        Date fecha = new Date();
        fecha.setAño(2021);
        fecha.setMes(1);
        fecha.setDia(31);
        fecha.siguienteDia();
        assertTrue(fecha.getDia() == 1);
        assertTrue(fecha.getMes() == 2);
        assertTrue(fecha.getAño() == 2021);
    }

    /*el resto de pruebas */
    @Test
    public void testSiguienteDia2(){
        Date fecha = new Date();
        fecha.setAño(2020);
        fecha.setMes(2);
        fecha.setDia(29);
        fecha.siguienteDia();
        assertTrue(fecha.getDia() == 1);
        assertTrue(fecha.getMes() == 3);
        assertTrue(fecha.getAño() == 2020);
    }       

    @Test
    public void testSiguienteDia3(){    
        
}
