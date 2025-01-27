public class App {
    public static void main(String[] args) throws Exception {

        // Crear una cuenta con saldo inicial de 1000
        Cuenta cuenta = new Cuenta(1, 1000);

        // Depositar 500
        cuenta.depositar(500);

        // Retirar 200
        cuenta.retirar(200);

        // Consultar saldo
        System.out.println("Saldo: " + cuenta.consultarSaldo());
    }
}
