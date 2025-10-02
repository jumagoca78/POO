class UsuarioObservador implements Observador {
    private String nombre;

    public UsuarioObservador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(Tarea tarea) {
        System.out.println("[" + nombre + "] ha sido notificado: La tarea '" + tarea.getNombre() + "' cambió de estado a " + tarea.getEstadoTexto());
    }
}