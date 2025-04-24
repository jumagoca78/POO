class OrdenarPorPrioridad implements EstrategiaOrdenamiento {
    @Override
    public void ordenar(Tarea[] tareas, int totalTareas) {
        // Implementación del algoritmo de ordenamiento por burbuja
        // para ordenar las tareas por prioridad de menor a mayor
        // (O(n^2) en el peor caso)
        // Este algoritmo es ineficiente para listas grandes, pero es simple y fácil de entender.
        // explicacion del algoritmo de ordenamiento por burbuja:
        // 1. Se recorre la lista de tareas varias veces.
        // 2. En cada iteración, se compara cada tarea con la siguiente.
        // 3. Si la tarea actual tiene una prioridad mayor que la siguiente, se
        //    intercambian sus posiciones.
        // 4. Este proceso se repite hasta que no se realizan más intercambios,
        //    lo que indica que la lista está ordenada.
        for (int i = 0; i < totalTareas - 1; i++) {
            for (int j = i + 1; j < totalTareas; j++) {
                if (tareas[i].getPrioridad() > tareas[j].getPrioridad()) {
                    Tarea temp = tareas[i];
                    tareas[i] = tareas[j];
                    tareas[j] = temp;
                }
            }
        }
    }
}