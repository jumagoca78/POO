public class Helicoptero implements TransporteVolador {
    
    @Override
    public void volar(String origen, String destino, int pasajeros) {
        System.out.println("Volando en helicoptero desde " + origen + " hasta " + destino + " con " + pasajeros + " pasajeros");
    }   
    
}
