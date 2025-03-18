public class DragonDomestico implements TransporteVolador {
    
    @Override
    public void volar(String origen, String destino, int pasajeros) {
        System.out.println("Volando en dragon doméstico desde " + origen + " hasta " + destino + " con " + pasajeros + " pasajeros");
    }
    
}
