public class GoogleMaps extends AppRuta {
    

    public GoogleMaps() {
        calcularRuta= new Tranvia();
    }

    public String toString () {
        return "Ruta en GoogleMaps..." + calcularRuta.toString();
    }
    
}
