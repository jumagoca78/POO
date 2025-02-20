public class App {
    public static void main(String[] args) throws Exception {
        Date cumpleProfe = new Date();
        cumpleProfe.setDia(13);
        cumpleProfe.setMes(2);
        cumpleProfe.setAño(2025);
        System.out.println("Mi cumple es: "+cumpleProfe.toFechaAbreviadaString());

        Date hoy = new Date();
        hoy.setDia(13);
        hoy.setMes(2);
        hoy.setAño(2025);
        System.out.println("Hoy es: "+hoy.toFechaAbreviadaString());

        Date fechaExamen = new Date();
        fechaExamen.setDia(11);
        fechaExamen.setMes(2);
        fechaExamen.setAño(2025);
        System.out.println("El examen es: "+fechaExamen.toFechaAbreviadaString());
    }
}
