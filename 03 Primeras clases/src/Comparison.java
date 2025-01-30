// Comparar números enteros usando sentencias if, operadores relacionales
// y operadores de igualdad.
import java.util.Scanner; // el programa usa la clase Scanner
public class Comparison {
    // El método main inicia la ejecución de la aplicación en Java
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener entrada desde la línea de comandos
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: "); // mensaje para el usuario
        int number1 = input.nextInt(); // leer el primer número ingresado por el usuario
        System.out.print("Ingrese el segundo número entero: "); // mensaje para el usuario
        int number2 = input.nextInt(); // leer el segundo número ingresado por el usuario
        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2); // mostrar igualdad
        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2); // mostrar desigualdad
        }
        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2); // mostrar menor que
        }
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2); // mostrar mayor que
        }
        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2); // mostrar menor o igual que
        }
        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2); // mostrar mayor o igual que
        }
    } // fin del método main
} // fin de la clase Comparison
