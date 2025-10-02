public class App {
    public static void main(String[] args) throws Exception {
        //Instanciar un objeto de la clase Date
        Date d = new Date();
        System.out.println(d.toString());
        
        Date soloDia = new Date (13);
        System.out.println(soloDia.toString());

        Date soloDiaMes = new Date (13, 5);
        System.out.println(soloDiaMes.toString());

        Date soloDiaMesAño = new Date (101, 85, 20021);
        System.out.println(soloDiaMesAño.toString());

        Date copia = new Date (soloDiaMesAño);
        System.out.println(copia.toString());
    }
}
