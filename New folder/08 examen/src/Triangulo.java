public class Triangulo {
    
    
    private double lado1,lado2,base,altura;

    public Triangulo(double lado1, double lado2, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        // Asumiendo un triángulo rectángulo para simplificar el cálculo del perímetro
        return lado1 + lado2 + base;
    }

    //setters y getters
    public double getBase() {
        return base;
    }        
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
