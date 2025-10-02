class OrdenadorDeTareas {
    public static void ordenar(Tarea[] tareas, int totalTareas, EstrategiaOrdenamiento estrategia) {
        estrategia.ordenar(tareas, totalTareas);
    }
}