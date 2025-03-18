

public class App {
    public static void main(String[] args) throws Exception {
        
        //creamos el aeropuerto
        

        //creamos los Transportes voladores
        TransporteVolador avion = new Avion();
        TransporteVolador helicoptero = new Helicoptero();
        TransporteVolador dragon = new DragonDomestico();

        Aeropuerto aeropuerto = new Aeropuerto(avion);
        System.out.println(aeropuerto);
        avion.volar("CDMX", "GDL", 200);

        aeropuerto.acepta(helicoptero);
        System.out.println(aeropuerto);
        helicoptero.volar("CDMX", "GDL", 2);

        aeropuerto.acepta   (dragon);
        System.out.println(aeropuerto);
        dragon.volar("CDMX", "GDL", 1);
        


    }
}
