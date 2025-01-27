/*Esta clase representa una cuenta de banco
tiene como atributos el numero de cuenta  y el saldo de la cuenta
tiene como metodos depositar, retirar y consultar saldo*/

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    
    public Cuenta(int numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public void depositar(double cantidad){
        saldo += cantidad;
    }
    
    public void retirar(double cantidad){
        //VERIFICAR QUE EL SALDO SEA SUFICIENTE

        saldo -= cantidad;
    }
    
    public double consultarSaldo(){
        return saldo;
    }
}