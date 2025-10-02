public class AppRuta {
    CalcularRuta calcularRuta;

    public void setCalcularRuta(CalcularRuta calcularRuta) {
        this.calcularRuta = calcularRuta;
    }
    

    public void performCalcularRuta() {
        calcularRuta.calcularRuta();
    }
}
