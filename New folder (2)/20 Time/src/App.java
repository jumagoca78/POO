public class App {
    public static void main(String[] args) throws Exception {
        Date mireloj = new Date();
        mireloj.setAño(2020);
        mireloj.setDia(29);
        mireloj.setMes(2);
        System.out.println(mireloj.toFechaAbreviadaString());
    }
}
