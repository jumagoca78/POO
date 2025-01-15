import java.util.Scanner;

public class SimpleShapesMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("=== Menú de Formas Geométricas ===");
        System.out.println("1. Cuadrado");
        System.out.println("2. Círculo");
        System.out.println("3. Triángulo");
        System.out.println("4. Salir");

        do {
            System.out.print("\nSelecciona una opción (1-4): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    manejarCuadrado();
                    break;
                case 2:
                    manejarCirculo();
                    break;
                case 3:
                    manejarTriangulo();
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    // Método para manejar la rotación y sonido del cuadrado
    public static void manejarCuadrado() {
        rotarCuadrado();
        reproducirSonidoCuadrado();
    }

    // Método para manejar la rotación y sonido del círculo
    public static void manejarCirculo() {
        rotarCirculo();
        reproducirSonidoCirculo();
    }

    // Método para manejar la rotación y sonido del triángulo
    public static void manejarTriangulo() {
        rotarTriangulo();
        reproducirSonidoTriangulo();
    }

    // Funciones específicas de rotación
    public static void rotarCuadrado() {
        System.out.println("Rotando el Cuadrado 180°...");
    }

    public static void rotarCirculo() {
        System.out.println("Rotando el Círculo 180°...");
    }

    public static void rotarTriangulo() {
        System.out.println("Rotando el Triángulo 180°...");
    }

    // Funciones específicas de sonido
    public static void reproducirSonidoCuadrado() {
        System.out.println("Reproduciendo sonido MP3 del Cuadrado...");
    }

    public static void reproducirSonidoCirculo() {
        System.out.println("Reproduciendo soni      do MP3 del Círculo...");
    }

    public static void reproducirSonidoTriangulo() {
        System.out.println("Reproduciendo sonido MP3 del Triángulo...");
    }
}
