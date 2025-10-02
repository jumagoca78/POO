public class AgregarDuende {

    //agregar un duende de 1 a 1 siempre y cuando no pase de 120 
    public void ejecutar(TallerdeSanta taller) {
        if (taller.getDuendesLaborando() < 120) {
            taller.setDuendesLaborando(taller.getDuendesLaborando() + 1);
        }
    }
}

