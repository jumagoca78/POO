import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;

public class RegistroSwingTest {
    private RegistroSwing registro;

    @Before
    public void setUp() {
        SwingUtilities.invokeLater(() -> registro = new RegistroSwing());
        try {
            Thread.sleep(1000); // Esperar a que la UI cargue
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegistroExitoso() {
        registro.setFields("Juan Pérez", "juan@example.com", "12345678", "2005-03-10", "123456");
        registro.clickRegisterButton();
        assertEquals("Registro exitoso.", registro.getValidationMessage());
    }

    @Test
    public void testRegistroFallidoCamposVacios() {
        registro.setFields("", "", "", "", "");
        registro.clickRegisterButton();
        assertEquals("Todos los campos son obligatorios.", registro.getValidationMessage());
    }
}