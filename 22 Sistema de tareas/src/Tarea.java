import java.text.SimpleDateFormat;
import java.util.Date;

class Tarea implements Subject {
    private String nombre;
    private int prioridad;
    private Date fecha;
    private int estatus;
    private EstrategiaOrdenamiento estrategia;
    private Observer[] observadores = new Observer[10];
    private int totalObservadores = 0;

    public Tarea(String nombre, int prioridad, Date fecha, int estatus) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.fecha = fecha;
        this.estatus = estatus;
    }

    public String getNombre() { return nombre; }
    public int getPrioridad() { return prioridad; }
    public Date getFecha() { return fecha; }
    public int getEstatus() { return estatus; }

    public void cambiarEstatus(int nuevo) {
        if (this.estatus != nuevo) {
            this.estatus = nuevo;
            notifyObservers();
        }
    }

    public void setEstrategia(EstrategiaOrdenamiento estrategia) {
        this.estrategia = estrategia;
    }

    public void ordenar(Tarea[] tareas, int total) {
        if (estrategia != null) {
            estrategia.ordenar(tareas, total);
        }
    }

    public void registerObserver(Observer o) {
        if (totalObservadores < observadores.length) {
            observadores[totalObservadores++] = o;
        }
    }

    public void removeObserver(Observer o) {
        for (int i = 0; i < totalObservadores; i++) {
            if (observadores[i].equals(o)) {
                for (int j = i; j < totalObservadores - 1; j++) {
                    observadores[j] = observadores[j + 1];
                }
                totalObservadores--;
                break;
            }
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < totalObservadores; i++) {
            observadores[i].update(this);
        }
    }

    @Override
    public String toString() {
        String[] estados = { "Por hacer", "En progreso", "Terminada" };
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return nombre + " | Prioridad: " + prioridad + " | Fecha: " + sdf.format(fecha) + " | Estado: " + estados[estatus];
    }
}