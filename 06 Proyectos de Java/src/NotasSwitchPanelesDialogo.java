public class NotasSwitchPanelesDialogo {
    /*
     * Programa que lee una nota y muestra la calificación correspondiente
     * utilizando la estructura de control switch
     * y la clase JOptionPane para mostrar mensajes en cuadros de diálogo
     * 
     * Los metodo showMessageDialog y showInputDialog de la clase JOptionPane
     * permiten mostrar mensajes en cuadros de diálogo y leer datos
     * 
     * El método showMessageDialog recibe tres argumentos:
     * 1. El componente padre, en este caso null
     * 2. El mensaje a mostrar
     * 3. El título de la ventana
     * 
     * El método showInputDialog recibe dos argumentos:
     * 1. El mensaje a mostrar
     *  2. El título de la ventana
     * 
     * El método parseInt de la clase Integer convierte una cadena en un número entero
     * 
     * La estructura de control switch permite evaluar una expresión y compararla con
     * diferentes valores, ejecutando el bloque de código correspondiente al valor que coincida
     * 
     * En este caso se divide la nota entre 100 y se compara el resultado con diferentes valores
     * 
     */
    public static void main(String[] args) {
        int nota;
        String textoNota;
        textoNota = javax.swing.JOptionPane.showInputDialog("Ingresar nota:");
        nota = Integer.parseInt(textoNota);

        switch (nota / 100) {
            case 100:
                javax.swing.JOptionPane.showMessageDialog(null, "A");
                break;
            case 90:
                javax.swing.JOptionPane.showMessageDialog(null, "B");
                break;
            case 80:
                javax.swing.JOptionPane.showMessageDialog(null, "C");
                break;
            case 70:
                javax.swing.JOptionPane.showMessageDialog(null, "D");
                break;
            case 60:
                javax.swing.JOptionPane.showMessageDialog(null, "F");
                break;
            default:
                javax.swing.JOptionPane.showMessageDialog(null, "La nota no existe");
        }
    }
}
