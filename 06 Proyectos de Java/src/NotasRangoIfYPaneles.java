/*
 * Este programa lee una nota y muestra la calificación correspondiente
 * utilizando la estructura de control if-else-if
 * y la clase JOptionPane para mostrar mensajes en cuadros de diálogo
 * 
 * los metodo showMessageDialog y showInputDialog de la clase JOptionPane
 * permiten mostrar mensajes en cuadros de diálogo y leer datos
 * 
 * El método showMessageDialog recibe tres argumentos:
 * 1. El componente padre, en este caso null
 *  2. El mensaje a mostrar
 * 3. El título de la ventana
 * 
 * El método showInputDialog recibe dos argumentos:
 * 1. El mensaje a mostrar
 *  2. El título de la ventana
 * 
 * El método parseInt de la clase Integer convierte una cadena en un número entero
 * 
 * La estructura de control if-else-if permite evaluar una expresión y compararla con
 * diferentes valores, ejecutando el bloque de código correspondiente al valor que coincida
 * 
 * En este caso se evalúa la nota en diferentes rangos y se muestra la calificación correspondiente
 * 
 */

public class NotasRangoIfYPaneles {
    public static void main(String[] args) {
        int nota;
        String textoNota;
        textoNota = javax.swing.JOptionPane.showInputDialog("Ingresar nota:");
        nota = Integer.parseInt(textoNota);

        if (nota >= 90) 
            javax.swing.JOptionPane.showMessageDialog(null, "A");
        else if (nota >= 80 && nota < 90) 
                javax.swing.JOptionPane.showMessageDialog(null, "B");
            else if (nota >= 70 && nota < 80) 
                    javax.swing.JOptionPane.showMessageDialog(null, "C");
                else if (nota >= 60 && nota < 70) 
                        javax.swing.JOptionPane.showMessageDialog(null, "D");
                     else 
                        javax.swing.JOptionPane.showMessageDialog(null, "F");
    } 
}
