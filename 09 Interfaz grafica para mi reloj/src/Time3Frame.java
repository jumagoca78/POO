/*
 * Eliminado init() y JApplet: Ahora, el código usa un constructor en TimeTest4 para inicializar el JFrame.
 * Se usa super("Time GUI - JFrame Version");: Para establecer el título del JFrame.
 * Se reemplazó getContentPane() con setLayout(new FlowLayout());: 
 * Esto configura directamente el diseño dentro del JFrame.
 * Se agregó setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);: Para que la ventana se cierre correctamente.
 * displayField: JFrame muestra en su barra de estado .
 * Validación de entradas (NumberFormatException): 
 * Para evitar errores cuando los usuarios ingresen valores no numéricos.
 * main(): Para lanzar el JFrame correctamente.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Time3Frame extends JFrame implements ActionListener {
    private Time3 time;

    private JLabel hourLabel, minuteLabel, secondLabel;
    private JTextField hourField, minuteField, secondField, displayField;
    private JButton tickButton;

    // Constructor para inicializar el JFrame
    public Time3Frame() {
        super("Time GUI - JFrame Version");
        time = new Time3(); // crea objeto Time3
        setLayout(new FlowLayout()); // Configura el diseño del JFrame

        // Establece hourLabel y hourField
        hourLabel = new JLabel("Set Hour");
        hourField = new JTextField(10);
        add(hourLabel);
        add(hourField);

        // Establece minuteLabel y minuteField
        minuteLabel = new JLabel("Set Minute");
        minuteField = new JTextField(10);
        add(minuteLabel);
        add(minuteField);

        // Establece secondLabel y secondField
        secondLabel = new JLabel("Set Second");
        secondField = new JTextField(10);
        add(secondLabel);
        add(secondField);

        // Establece displayField
        displayField = new JTextField(30);
        displayField.setEditable(false);
        add(displayField);

        // Establece tickButton
        tickButton = new JButton("Add 1 to Second");
        add(tickButton);

        // Registro de eventos
        hourField.addActionListener(this);
        minuteField.addActionListener(this);
        secondField.addActionListener(this);
        tickButton.addActionListener(this);

        displayTime(); // Actualiza el texto de displayField
    }

    // Control de eventos de botón y campos de texto
    public void actionPerformed(ActionEvent event) {
        try {
            if (event.getSource() == tickButton) {
                tick();
            } else if (event.getSource() == hourField) {
                time.setHour(Integer.parseInt(hourField.getText()));
                hourField.setText("");
            } else if (event.getSource() == minuteField) {
                time.setMinute(Integer.parseInt(minuteField.getText()));
                minuteField.setText("");
            } else if (event.getSource() == secondField) {
                time.setSecond(Integer.parseInt(secondField.getText()));
                secondField.setText("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter numbers only.", 
                                          "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        displayTime(); // Actualiza la visualización
    }

    // Actualiza displayField con la hora actual
    public void displayTime() {
        displayField.setText("Hour: " + time.getHour() + 
            "; Minute: " + time.getMinute() + 
            "; Second: " + time.getSecond() +
            " | Standard: " + time.toStandardString() +
            " | Universal: " + time.toUniversalString());
    }

    // Añade uno al segundo y actualiza hora/minuto si es necesario
    public void tick() {
        time.setSecond((time.getSecond() + 1) % 60);

        if (time.getSecond() == 0) {
            time.setMinute((time.getMinute() + 1) % 60);

            if (time.getMinute() == 0)
                time.setHour((time.getHour() + 1) % 24);
        }
        displayTime();
    }

    
}