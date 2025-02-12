/*
 * ThisTest (clase principal):

Crea una instancia de SimpleTime con la hora 12:30:19.
Llama a buildString() y muestra la salida en un cuadro de diálogo.
Finaliza el programa con System.exit(0).
SimpleTime (clase secundaria):

Utiliza this en el constructor para diferenciar las variables de instancia de los parámetros.
buildString() muestra cómo this puede usarse explícitamente (this.toStandardString()) e 
implícitamente (toStandardString()).
toStandardString() devuelve la hora en formato HH:MM:SS utilizando DecimalFormat.
Este código demuestra el uso de this en constructores y métodos, ayudando a distinguir 
entre variables locales y variables de instancia. 
 */
import javax.swing.*;
import java.text.DecimalFormat;

public class ThisTest {

    public static void main( String args[] ) {
        SimpleTime time = new SimpleTime(12, 30, 19);

        JOptionPane.showMessageDialog(null, time.buildString(),
            "Demonstrating the \"this\" Reference",
            JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
} // end class ThisTest


