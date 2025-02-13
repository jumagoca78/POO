public class App {
    public static void main(String[] args) throws Exception {
        //Instanciar un objeto de la clase Date
        Date d = new Date();
        Date soloDia = new Date (13);
        Date soloDiaMes = new Date (13, 5);
        Date soloDiaMesAño = new Date (101, 85, 20021);
        Date copia = new Date (soloDiaMesAño);
        //Imprimir el valor de la fecha        
        System.out.println(copia.toString());
    }
}
