public class QuitarDuende {
//Codigo para eliminar un duende y no quede en 0 
    public void ejecutar(TallerdeSanta taller) {
        if (taller.getDuendesLaborando() > 1) {
            taller.setDuendesLaborando(taller.getDuendesLaborando() - 1);
        }


        
    }


}

