public class Avion implements TransporteVolador {
    
    @Override
    public void volar(String origen, String destino, int pasajeros) {
        System.out.println("Volando en avion desde " + origen + " hasta " + destino + " con " + pasajeros + " pasajeros");
    }

    @Override
    public String toString() {
        return "Avion";
    }
    
}
