public class Cuenta {
    
    private Banco banco;
    private Cliente cliente;

    private int noCuenta;
    private double dinero;

    //Constructores
    //Define como voy a inicializar los valores de la cuenta
    public Cuenta(int noCuenta, double dinero, Banco banco, Cliente cliente){
        this.noCuenta = noCuenta;
        this.dinero = dinero;
    }

    public Cuenta(){
        this.noCuenta = 0;
        this.dinero = 0;
    }

    public Cuenta (int noCuenta){
        this.noCuenta = noCuenta;
        this.dinero = 0;
    }

    public Cuenta (double dinero){
        this.noCuenta = 0;
        this.dinero = dinero;
    }

    ///tenemos que definir metodos para modificar los valores de los atributos
    /// normalmnete se llaman setters por que siempre llevan el prefijo set
    ///
    public void setNoCuenta(int noCuenta){
        this.noCuenta = validarCuenta(noCuenta);
    }

    public void setDinero(double dinero){
        this.dinero = dinero;
    }

    //los metodos getters recuperan el valor de los atributos
    public int getNoCuenta(){
        return this.noCuenta;
    }

    public double getDinero(){
        return this.dinero;
    }    

    private int validarCuenta (int noCuenta){
        if (noCuenta < 0){
            System.out.println("No se puede asignar un numero de cuenta negativo");
            return 0;
        }
        else{
            this.noCuenta = noCuenta;
        }
        return noCuenta;
    }

}
