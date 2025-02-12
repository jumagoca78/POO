/* 
 * Programa que lee una nota y muestra la calificación correspondiente
 * utilizando la estructura de control if-else-if
 * 
 * 
 * El método parseInt de la clase Integer convierte una cadena en un número entero
 * 
 * 
 */
import java.util.Scanner;
public class NotasConIf {
    public static void main(String[] args) {
        int nota;
        String textoNota;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar nota:");
        textoNota = scanner.nextLine();
        nota = Integer.parseInt(textoNota);

        if (nota >= 90) 
            System.out.println("A");
        else if (nota >= 80) 
                System.out.println("B");
            else if (nota >= 70) 
                    System.out.println("C");
                else if (nota >= 60) 
                        System.out.println("D");
                     else 
                        System.out.println("F");
        scanner.close();// Cerrar el scanner para liberar recursos
    }
}