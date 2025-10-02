import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TallerDeSantaTest {

    @Test
    public void testProduccionCorrectaEnero() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(1);  
        assertEquals(225, taller.calcularProduccion(1)); 
    }

    @Test
    public void testProduccionCorrectaFebrero() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(2);  
        assertEquals(450, taller.calcularProduccion(2)); 
    }

    @Test
    public void testAgregarDuende() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(1);  
        taller.agregarDuende();  
        assertEquals(270, taller.calcularProduccion(1)); 
    }

    @Test
    public void testQuitarDuende() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(1);  
        taller.quitarDuende();  
        assertEquals(180, taller.calcularProduccion(1)); 
    }

    @Test
    public void testQuitarMenosDe3Duendes() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(1);  
        for (int i = 0; i < 3; i++) {
            taller.quitarDuende();  
        }
        assertEquals(225, taller.calcularProduccion(1)); 
    }

    @Test
    public void testSetDuendesTrabajandoManualValido() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(3);  
        taller.setDuendesTrabajandoManual(10);  
        assertEquals( 450, taller.calcularProduccion(3)); 
    }

    @Test
    public void testSetDuendesTrabajandoManualInvalido() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(3);  
        taller.setDuendesTrabajandoManual(2);  
        assertEquals(450, taller.calcularProduccion(3)); 
    }

    @Test
    public void testAgregarMasDe60Duendes() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(12);  
        for (int i = 0; i < 100; i++) {
            taller.agregarDuende();  
        }
        assertEquals(2700, taller.calcularProduccion(12)); 
    }

    @Test
    public void testMaximoDuendesDiciembre() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(12);  
        assertEquals(2700, taller.calcularProduccion(12)); 
    }

    @Test
    public void testSetMesInvalido() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(13);  
        assertEquals(0, taller.calcularProduccion(13)); 
    }

    @Test
    public void testSetMesValido() {
        TallerDeSanta taller = new TallerDeSanta();
        taller.setMes(6);  
        assertEquals( 1350, taller.calcularProduccion(6)); 
    }
}
