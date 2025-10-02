public class TallerdeSanta {
    private int duendesLaborando;
    private int mes;
    private final int[] maximosDuendes = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        
        public TallerdeSanta(int mes2, int duendes) {
        //TODO Auto-generated constructor stub
    }

        public void TallerDeSanta (int mes, int duendesLaborando) {

            
            setMes(mes);
            setDuendesLaborando(duendesLaborando);
        }
        
        public void setMes(int mes) {
            if (mes >= 1 && mes <= 12) {
                this.mes = mes;
            }
        }
        
        public void setDuendesLaborando(int duendes) {
            int max = maximosDuendes[this.mes - 1];
            if (duendes >= 1 && duendes <= max) {
                this.duendesLaborando = duendes;
            }
        }
        
        public int getDuendesLaborando() {
            return duendesLaborando;
        }
        
        public int getMes() {
            return mes;
        }

    
}
