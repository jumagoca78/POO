public class App {
    public static void main(String[] args) throws Exception {

        // Crear una cuenta con saldo inicial de 1000
        Cuenta cuentaFred = new Cuenta(1, 1000);
        Cuenta cuentaSam = new Cuenta(2, 21000);
        Cuenta cuentaEva = new Cuenta(3, 12000);
        Cuenta cuentaProfesor = new Cuenta(4, 200);

        // Depositar 500
        cuentaFred.depositar(500);

        // Retirar 200
        cuentaFred.retirar(200);

        // Consultar saldo
        System.out.println("Saldo Fred: " + cuentaFred.consultarSaldo());
        System.out.println("Saldo Sam: " + cuentaSam.consultarSaldo());
        System.out.println("Saldo Eva: " + cuentaEva.consultarSaldo());
        System.out.println("Saldo Profesor: " + cuentaProfesor.consultarSaldo());
    }
}



