// Clase principal para ejecutar el programa
public class FiguraDemo {
    public static void main(String[] args) {
        Figura[] shapes = {
            new Cuadrado(),         
            new Circulo(),
            new Triangulo(),
            new Amorfo()
        };

        System.out.println("=== Selecciona una Figura ===");
        System.out.println("1. Cuadrado");
        System.out.println("2. Círculo");
        System.out.println("3. Triángulo");
        System.out.println("4. Ameba");
        System.out.println("5. Salir");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcion;

        do {
            System.out.print("\nSelecciona una opción (1-5): ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                shapes[opcion - 1].rotate();
                shapes[opcion - 1].playSound();
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
