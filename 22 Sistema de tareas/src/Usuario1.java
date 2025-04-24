class Usuario1 implements Observer, Display {
    private String nombre;
    private Tarea tareaObservada;

    public Usuario1(String nombre) {
        this.nombre = nombre;
    }

    public void update(Tarea tarea) {
        this.tareaObservada = tarea;
        display();
    }

    public void display() {
        System.out.println("[" + nombre + "] Notificado -> Estado actualizado de la tarea: " + tareaObservada);
    }
}