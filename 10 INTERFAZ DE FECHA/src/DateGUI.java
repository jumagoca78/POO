import java.awt.*;
import javax.swing.*;

public class DateGUI {
    private Date date;
    private JTextField dayField, monthField, yearField;
    private JLabel displayLabel;

    public DateGUI() {
        date = new Date();

        JFrame frame = new JFrame("Date GUI - Estudiantes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2, 5, 5));

        dayField = createField(frame, "Día:");
        monthField = createField(frame, "Mes:");
        yearField = createField(frame, "Año:");

        displayLabel = new JLabel(getDateString(), SwingConstants.CENTER);
        frame.add(displayLabel);

        JButton nextDayButton = new JButton("Avanzar Día");
        frame.add(nextDayButton);

        dayField.addActionListener(e -> updateDay());
        monthField.addActionListener(e -> updateMonth());
        yearField.addActionListener(e -> updateYear());
        nextDayButton.addActionListener(e -> nextDay());

        frame.setVisible(true);
    }

    private JTextField createField(JFrame frame, String labelText) {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel(labelText));
        JTextField field = new JTextField(5);
        panel.add(field);
        frame.add(panel);
        return field;
    }

    private void updateDay() { date.setDia(Integer.parseInt(dayField.getText())); updateDisplay(); }
    private void updateMonth() { date.setMes(Integer.parseInt(monthField.getText())); updateDisplay(); }
    private void updateYear() { date.setAño(Integer.parseInt(yearField.getText())); updateDisplay(); }
    private void nextDay() { date.siguienteDia(); updateDisplay(); }

    private void updateDisplay() { displayLabel.setText(getDateString()); }
    private String getDateString() { return "Fecha: " + date.toNumericString() + " | " + date.toTextualString(); }

    public static void main(String[] args) { SwingUtilities.invokeLater(DateGUI::new); }


}
