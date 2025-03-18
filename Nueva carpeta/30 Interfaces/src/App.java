

public class App {
    public static void main(String[] args) throws Exception {
        
        //creamos el aeropuerto
        

        //creamos los Transportes voladores
        TransporteVolador avion = new Avion();
        TransporteVolador helicoptero = new Helicoptero();
        TransporteVolador dragon = new DragonDomestico();

        Aeropuerto aeropuerto = new Aeropuerto(avion);

        avion.volar("CDMX", "GDL", 200);
        helicoptero.volar("CDMX", "GDL", 2);
        dragon.volar("CDMX", "GDL", 1);
        


    }
}
