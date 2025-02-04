public class App {
    public static void main(String[] args) throws Exception {
        
        Cuenta cuentaSantiago = new Cuenta();
        Cuenta cuentaSamantha = new Cuenta (1);
        Cuenta cuentaLuis = new Cuenta (1000.0);
        Cuenta cuentaAna = new Cuenta (2, 2000.0);

        cuentaSantiago.setNoCuenta(8);
        cuentaSantiago.setDinero( 10000000.0);




    }
}
