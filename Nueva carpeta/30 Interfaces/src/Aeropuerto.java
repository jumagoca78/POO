public class Aeropuerto{

    //Usa un transporte volador

    TransporteVolador transporteVolador;


    public Aeropuerto(TransporteVolador transporteVolador){
        this.transporteVolador = transporteVolador;
    }

    public void acepta (TransporteVolador transporteVolador){
        this.transporteVolador = transporteVolador;
    }

    @Override
    public String toString(){
        return "Aeropuerto con servicio de vuelo disponible " + transporteVolador;
    }

}