/*
 * Programa que lee una nota y muestra la calificación correspondiente
 * utilizando la estructura de control if-else-if
 * y la clase JOptionPane para mostrar mensajes en cuadros de diálogo
 * 
 * los metodo showMessageDialog y showInputDialog de la clase JOptionPane
 * permiten mostrar mensajes en cuadros de diálogo y leer datos
 * 
 * El método showMessageDialog recibe tres argumentos:
 * 1. El componente padre, en este caso null
 * 2. El mensaje a mostrar
 * 3. El título de la ventana
 * 
 * El método showInputDialog recibe dos argumentos:
 * 1. El mensaje a mostrar
 * 2. El título de la ventana
 * 
 * El método parseInt de la clase Integer convierte una cadena en un número entero
 * 
 */
import javax.swing.JOptionPane;
public class NotasConIfPanelesDialogo {
    public static void main(String[] args) {
        int nota;
        String textoNota;
        textoNota = JOptionPane.showInputDialog("Ingresar nota:");
        nota = Integer.parseInt(textoNota);

        if (nota >= 90) 
            JOptionPane.showMessageDialog(null, "A");
        else if (nota >= 80) 
                JOptionPane.showMessageDialog(null, "B");
            else if (nota >= 70) 
                    JOptionPane.showMessageDialog(null, "C");
                else if (nota >= 60) 
                        JOptionPane.showMessageDialog(null, "D");
                     else 
                        JOptionPane.showMessageDialog(null, "F");
    }
    
}
