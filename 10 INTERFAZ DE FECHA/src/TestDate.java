/*
 * Las pruebas de mi clase Date
 */

 import static org.junit.Assert.assertEquals;
 import org.junit.Test;
 public class TestDate {
     
     @Test
     public void testLimiteInferiorDiaEnero(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(1);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaEnero(){
         Date d = new Date();
         d.setDia(32);
         d.setMes(1);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaFebrero(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(2);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaFebrero(){
         Date d = new Date();
         d.setDia(29);
         d.setMes(2);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaMarzo(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(3);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaMarzo(){
         Date d = new Date();
         d.setDia(32);
         d.setMes(3);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaAbril(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(4);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaAbril(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(4);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaMayo(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(5);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaMayo(){
         Date d = new Date();
         d.setDia(32);
         d.setMes(5);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaJunio(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(6);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaJunio(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(6);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaJulio(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(7);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaJulio(){
         Date d = new Date();
         d.setDia(32);
         d.setMes(7);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaAgosto(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(8);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaAgosto(){
         Date d = new Date();
         d.setDia(32);
         d.setMes(8);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaSeptiembre(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(9);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaSeptiembre(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(9);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaOctubre(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(10);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaOctubre(){
         Date d = new Date();
         d.setDia(32);
         d.setMes(10);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaNoviembre(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(11);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaNoviembre(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(11);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteInferiorDiaDiciembre(){
         Date d = new Date();
         d.setDia(0);
         d.setMes(12);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     @Test
     public void testLimiteSuperiorDiaDiciembre(){
         Date d = new Date();
         d.setDia(32);
         d.setMes(12);
         d.setAño(2025);
         assertEquals(1, d.getDia());
     }
 
     /*Test limite superior e inferior del mes */
 
     @Test
     public void testLimiteInferiorMes(){
         Date d = new Date();
         d.setDia(1);
         d.setMes(0);
         d.setAño(2025);
         assertEquals(1, d.getMes());
     }
 
     @Test
     public void testLimiteSuperiorMes(){
         Date d = new Date();
         d.setDia(1);
         d.setMes(13);
         d.setAño(2025);
         assertEquals(1, d.getMes());
     }
 
     /*Test limites inferior y superior del año */
 
     @Test
     public void testLimiteInferiorAño(){
         Date d = new Date();
         d.setDia(1);
         d.setMes(1);
         d.setAño(1899);
         assertEquals(1900, d.getAño());
     }
 
     @Test
     public void testLimiteSuperiorAño(){
         Date d = new Date();
         d.setDia(1);
         d.setMes(1);
         d.setAño(2026);
         assertEquals(1900, d.getAño());
     }
 
     /*
      * Test de la funcion siguienteDia para cada mes del año
      */
 
     @Test
     public void testSiguienteDiaEnero(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(1);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(2, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaFebrero(){
         Date d = new Date();
         d.setDia(28);
         d.setMes(2);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(3, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaFebreroBisiesto(){
         Date d = new Date();
         d.setAño(2020);
         d.setMes(2);
         d.setDia(29);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(3, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaMarzo(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(3);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(4, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaAbril(){
         Date d = new Date();
         d.setDia(30);
         d.setMes(4);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(5, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaMayo(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(5);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(6, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaJunio(){
         Date d = new Date();
         d.setDia(30);
         d.setMes(6);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(7, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaJulio(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(7);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(8, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaAgosto(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(8);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(9, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaSeptiembre(){
         Date d = new Date();
         d.setDia(30);
         d.setMes(9);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(10, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaOctubre(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(10);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(11, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaNoviembre(){
         Date d = new Date();
         d.setDia(30);
         d.setMes(11);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(12, d.getMes());
     }
 
     @Test
     public void testSiguienteDiaDiciembre(){
         Date d = new Date();
         d.setDia(31);
         d.setMes(12);
         d.setAño(2025);
         d.siguienteDia();
         assertEquals(1, d.getDia());
         assertEquals(1, d.getMes());
         assertEquals(2026, d.getAño());
     }
 }