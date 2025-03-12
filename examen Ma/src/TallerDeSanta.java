public class TallerDeSanta {
    private int[] duendesLaborando; 
    private int mes; 
    
    public TallerDeSanta() {
        duendesLaborando = new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
        mes = 1; 
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mes inválido.");
        }
    }

    public void setDuendesTrabajandoManual(int duendes) {
        if (duendes >= 3 && duendes <= 60) {
            duendesLaborando[mes - 1] = duendes;
        } else {
            System.out.println("Número de duendes inválido. Debe ser entre 3 y 60.");
        }
    }

    public int calcularProduccion(int mes) {
        if (mes >= 1 && mes <= 12) {
            return duendesLaborando[mes - 1] * 45; 
        } else {
            System.out.println("Mes inválido.");
            return 0;
        }
    }

    public void agregarDuende() {
        if (duendesLaborando[mes - 1] < 60) {
            duendesLaborando[mes - 1]++;
        }
    }

    public void quitarDuende() {
        if (duendesLaborando[mes - 1] > 3) {
            duendesLaborando[mes - 1]--;
        }
    }
}
