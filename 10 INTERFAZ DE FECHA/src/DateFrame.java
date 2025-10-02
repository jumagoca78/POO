import java.awt.*;
import javax.swing.*;

/*
 * Clase que crea una interfaz gráfica para manipular una fecha
 * @version 1.0 2021-05-15
 * 
 * JFRame frame: Ventana de la interfaz gráfica
 * JTextField dayField: Campo de texto para el día
 * JTextField monthField: Campo de texto para el mes
 * JTextField yearField: Campo de texto para el año
 * JLabel displayLabel: Etiqueta para mostrar la fecha
 * Date date: Objeto de la clase Date
 * 
 * createField(JFrame frame, String labelText): Método que crea un campo de texto
 * getDateString(): Método que devuelve la fecha en formato de texto
 * 
 * 
 */
public class DateFrame {
    private Date date;
    private JTextField dayField, monthField, yearField;
    private JLabel displayLabel;

    public DateFrame() {
        date = new Date();

        JFrame frame = new JFrame("Date GUI - Estudiantes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierra la ventana
        frame.setSize(400, 200); //tamaño de la ventana
        frame.setLayout(new GridLayout(3, 2, 5, 5)); //distribución de la ventana

        dayField = createField(frame, "Día:");//crea un campo de texto para el día
        monthField = createField(frame, "Mes:");//crea un campo de texto para el mes
        yearField = createField(frame, "Año:");//crea un campo de texto para el año

        displayLabel = new JLabel(getDateString(), SwingConstants.CENTER);
        frame.add(displayLabel);

        JButton nextDayButton = new JButton("Avanzar Día");
        frame.add(nextDayButton);

        JButton previousDayButton = new JButton("Retroceder Día");
        frame.add(previousDayButton);

        dayField.addActionListener(e -> updateDay());
        monthField.addActionListener(e -> updateMonth());
        yearField.addActionListener(e -> updateYear());
        nextDayButton.addActionListener(e -> nextDay());
        previousDayButton.addActionListener(e -> previousDay());

        frame.setVisible(true);
    }

    /*
     * Método que crea un campo de texto
     * @param JFrame frame: Ventana de la interfaz gráfica
     * @param String labelText: Texto que se mostrará en el campo de texto
     * @return JTextField: Campo de texto creado
     * 
     * JPanel panel: Panel para organizar los elementos
     * JTextField field: Campo de texto
     * 
     * panel.add(new JLabel(labelText)): Añade una etiqueta al panel
     * panel.add(field): Añade el campo de texto al panel
     */
    private JTextField createField(JFrame frame, String labelText) {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel(labelText));
        JTextField field = new JTextField(5);
        panel.add(field);
        frame.add(panel);
        return field;
    }

    private void updateDay() { 
        date.setDia(Integer.parseInt(dayField.getText())); 
        updateDisplay(); 
    }
    
    private void updateMonth() { 
        date.setMes(Integer.parseInt(monthField.getText())); 
        updateDisplay(); 
    }
    
    private void updateYear() { 
        date.setAño(Integer.parseInt(yearField.getText())); 
        updateDisplay(); 
    }

    private void nextDay() { 
        date.siguienteDia(); 
        updateDisplay(); 
    }

    private void previousDay() { 
        date.anteriorDia(); 
        updateDisplay(); 
    }

    private void updateDisplay() { 
        displayLabel.setText(getDateString()); 
    }

    private String getDateString() { 
        return "Fecha: " + date.toNumericString() + " | " + date.toNumericString(); }

    public static void main(String[] args) { SwingUtilities.invokeLater(DateFrame::new); }


}
