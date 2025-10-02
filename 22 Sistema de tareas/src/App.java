import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Tarea[] tareas = new Tarea[100];
        int totalTareas = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int opcion;
        do {
            System.out.println("\\n--- Menú de Tareas ---");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Mostrar tareas ordenadas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Prioridad (int): ");
                    int prioridad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Fecha (dd/MM/yyyy): ");
                    Date fecha = sdf.parse(scanner.nextLine());
                    System.out.print("Estatus (0: Por hacer, 1: En progreso, 2: Terminada): ");
                    int estatus = scanner.nextInt();
                    scanner.nextLine();

                    tareas[totalTareas++] = new Tarea(nombre, prioridad, fecha, estatus);
                    break;
                case 2:
                    System.out.println("Seleccione criterio:");
                    System.out.println("1. Por prioridad");
                    System.out.println("2. Por fecha");
                    System.out.println("3. Por estatus");
                    int criterio = scanner.nextInt();
                    scanner.nextLine();

                    EstrategiaOrdenamiento estrategia;
                    if (criterio == 1) estrategia = new OrdenarPorPrioridad();
                    else if (criterio == 2) estrategia = new OrdenarPorFecha();
                    else estrategia = new OrdenarPorEstatus();

                    OrdenadorDeTareas.ordenar(tareas, totalTareas, estrategia);

                    System.out.println("\\n--- Lista de tareas ---");
                    for (int i = 0; i < totalTareas; i++) {
                        System.out.println(tareas[i]);
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}



