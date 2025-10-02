public class OrdenarPorEstatus implements EstrategiaOrdenamiento {
    public void ordenar(Tarea[] tareas, int totalTareas) {
        for (int i = 0; i < totalTareas - 1; i++) {
            for (int j = i + 1; j < totalTareas; j++) {
                if (tareas[i].getEstatus() > tareas[j].getEstatus()) {
                    Tarea temp = tareas[i]; tareas[i] = tareas[j]; tareas[j] = temp;
                }
            }
        }
    }
} 