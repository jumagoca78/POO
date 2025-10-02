public class GestorDeTareas {
    private Tarea[] tareas = new Tarea[100];
    private int totalTareas = 0;
    private EstrategiaOrdenamiento estrategia;

    public void agregarTarea(Tarea tarea) {
        if (totalTareas < tareas.length) {
            tareas[totalTareas++] = tarea;
        } else {
            System.out.println("¡Límite de tareas alcanzado!");
        }
    }

    public void setEstrategia(EstrategiaOrdenamiento estrategia) {
        this.estrategia = estrategia;
    }

    public void ordenarTareas() {
        if (estrategia != null) {
            estrategia.ordenar(tareas, totalTareas);
        }
    }

    public void mostrarTareas() {
        if (totalTareas == 0) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (int i = 0; i < totalTareas; i++) {
                System.out.println(tareas[i]);
            }
        }
    }
} 
