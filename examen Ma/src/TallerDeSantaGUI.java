import java.awt.*;
import javax.swing.*;

public class TallerDeSantaGUI {
    private TallerDeSanta taller;
    private JTextField mesField;
    private JLabel displayLabel;
    private JTextField duendeCountField;

    private JTextField createField(JFrame frame, String labelText) {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel(labelText));
        JTextField field = new JTextField(5);
        panel.add(field);
        frame.add(panel);
        return field;
    }

    public TallerDeSantaGUI() {
        taller = new TallerDeSanta();   
        JFrame frame = new JFrame("Taller de Santa Claus");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(5, 2, 5, 5)); 

        
        mesField = createField(frame, "Mes (1-12): ");
        duendeCountField = createField(frame, "Cantidad de Duendes: ");
        
        
        displayLabel = new JLabel("Producción de Regalos: ", SwingConstants.CENTER);
        frame.add(displayLabel);

        JButton calcularButton = new JButton("Calcular Producción");
        JButton agregarButton = new JButton("Agregar Duende");
        JButton quitarButton = new JButton("Quitar Duende");

        frame.add(calcularButton);
        frame.add(agregarButton);
        frame.add(quitarButton);

        calcularButton.addActionListener(e -> calcularProduccion());
        agregarButton.addActionListener(e -> agregarDuende());
        quitarButton.addActionListener(e -> quitarDuende());

        frame.setVisible(true);
    }

    private void calcularProduccion() {
        try {
            int mes = Integer.parseInt(mesField.getText());
            int duendes = Integer.parseInt(duendeCountField.getText());
            taller.setMes(mes);
            taller.setDuendesTrabajandoManual(duendes); 
            int produccion = taller.calcularProduccion(mes);
            displayLabel.setText("Producción: " + produccion + " regalos");
        } catch (NumberFormatException e) {
            displayLabel.setText("Por favor, ingresa un valor válido.");
        }
    }

    private void agregarDuende() {
        try {
            int mes = Integer.parseInt(mesField.getText());
            taller.setMes(mes);
            taller.agregarDuende();
            int produccion = taller.calcularProduccion(mes);
            displayLabel.setText("Producción: " + produccion + " regalos");
        } catch (NumberFormatException e) {
            displayLabel.setText("Por favor, ingresa un mes válido.");
        }
    }

    private void quitarDuende() {
        try {
            int mes = Integer.parseInt(mesField.getText());
            taller.setMes(mes);
            taller.quitarDuende();
            int produccion = taller.calcularProduccion(mes);
            displayLabel.setText("Producción: " + produccion + " regalos");
        } catch (NumberFormatException e) {
            displayLabel.setText("Por favor, ingresa un mes válido.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TallerDeSantaGUI::new);
    }
}
