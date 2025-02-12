/*
 * Este programa prueba la clase Time1 y realiza lo siguiente:
* Crea un objeto Time1 con la hora inicial en 00:00:00.
* Muestra la hora en formato universal y estándar.
* Modifica la hora a 13:27:06 y vuelve a mostrarla.
* Intenta asignar valores inválidos (99:99:99), los cuales son corregidos a 00:00:00 debido a 
* la validación en setTime().
* Muestra los resultados en un cuadro de diálogo usando JOptionPane.
* Este código es una prueba unitaria básica para la clase Time1, asegurando que maneja correctamente 
* la inicialización, la actualización de la hora y la validación de datos inválidos.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Time1Test {

    public static void main( String args[] ) {
        Time1 time = new Time1();  // llama al constructor Time1

        // añade la versión en String del tiempo al String de salida
        String output = "The initial universal and Standar time is: " +
               time.buildString();

        // cambia la hora y actualiza el tiempo en la salida
        int hour=0, minute=0, second=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la hora: ");
        hour = input.nextInt();

        System.out.println("Ingrese los minutos: ");
        minute = input.nextInt();

        System.out.println("Ingrese los segundos: ");
        second = input.nextInt();

        time.setTime(hour, minute, second);
        output += "\n\nUniversal time after setTime is: " +
            time.toUniversalString() +
            "\nStandard time after setTime is: " +
            time.toStandardString();

        // Fijado con valores no válidos; actualiza el tiempo en la salida
        time.setTime(99, 99, 99);
        output += "\n\nAfter attempting invalid settings: " +
            "\nUniversal time: " + time.toUniversalString() +
            "\nStandard time: " + time.toStandardString();

        JOptionPane.showMessageDialog(null, output,
            "Testing Class Time1", JOptionPane.INFORMATION_MESSAGE);

        input.close();
        System.exit(0);
    }
} // end class TimeTest1