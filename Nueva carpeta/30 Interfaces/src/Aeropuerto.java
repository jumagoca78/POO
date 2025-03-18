public class Aeropuerto{

    //Usa un transporte volador

    TransporteVolador transporteVolador;


    public Aeropuerto(TransporteVolador transporteVolador){
        this.transporteVolador = transporteVolador;
    }

    public void acepta (TransporteVolador transporteVolador){
        this.transporteVolador = transporteVolador;
    }
    
}