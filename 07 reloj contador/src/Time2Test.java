import java.lang.reflect.Constructor;

/* 
        Este programa prueba la sobrecarga de constructores en la clase Time2:

Crea múltiples objetos Time2 usando diferentes constructores:

t1: Constructor sin parámetros, valores predeterminados (00:00:00).
t2: Constructor con solo la hora (02:00:00).
t3: Constructor con hora y minutos (21:34:00).
t4: Constructor con hora, minutos y segundos (12:25:42).
t5: Constructor con valores inválidos (27, 74, 99), corregido a 00:00:00.
t6: Constructor que copia el objeto t4 (12:25:42).
Genera una cadena output con los resultados de cada objeto Time2, mostrando:

Formato universal (24h)
Formato estándar (12h con AM/PM)
Muestra los resultados en un cuadro de diálogo (JOptionPane).
*/

import javax.swing.*;

public class Time2Test {

    public static void main( String args[] ) {
        Time2 t1 = new Time2();              // 00:00:00
        Time2 t2 = new Time2(2);             // 02:00:00
        Time2 t3 = new Time2(21, 34);        // 21:34:00
        Time2 t4 = new Time2(12, 25, 42);    // 12:25:42
        Time2 t5 = new Time2(27, 74, 99);    // 00:00:00 (valores inválidos)
        Time2 t6 = new Time2(t4);            // 12:25:42 (copia de t4)

        String output = "Constructed with:" +
            "\n\nt1: all arguments defaulted" +
            "\n   " + t1.toUniversalString() +
            "\n   " + t1.toStandardString();

        output += "\n\nt2: hour specified; minute and second defaulted" +
            "\n   " + t2.toUniversalString() +
            "\n   " + t2.toStandardString();

        output += "\n\nt3: hour and minute specified; second defaulted" +
            "\n   " + t3.toUniversalString() +
            "\n   " + t3.toStandardString();

        output += "\n\nt4: hour, minute and second specified" +
            "\n   " + t4.toUniversalString() +
            "\n   " + t4.toStandardString();

        output += "\n\nt5: all invalid values specified" +
            "\n   " + t5.toUniversalString() +
            "\n   " + t5.toStandardString();

        output += "\n\nt6: Time2 object t4 specified" +
            "\n   " + t6.toUniversalString() +
            "\n   " + t6.toStandardString();

        JOptionPane.showMessageDialog(null, output,
            "Overloaded Constructors", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
} // end class Time2Test

