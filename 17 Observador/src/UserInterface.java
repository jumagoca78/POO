import java.awt.*;
import javax.swing.*;

public class UserInterface {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Graphic Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 1, 10, 10));
        mainPanel.setBackground(Color.LIGHT_GRAY);
        
        JLabel titleLabel = new JLabel("USER INTERFACE", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(titleLabel);
        
        // Digital Output
        JPanel digitalOutputPanel = new JPanel(new FlowLayout());
        digitalOutputPanel.setBackground(Color.DARK_GRAY);
        JButton turnOffButton = new JButton("Turn Off");
        turnOffButton.setBackground(Color.RED);
        turnOffButton.setForeground(Color.WHITE);
        JButton turnOnButton = new JButton("Turn On");
        turnOnButton.setBackground(Color.GREEN);
        turnOnButton.setForeground(Color.WHITE);
        digitalOutputPanel.add(turnOffButton);
        digitalOutputPanel.add(turnOnButton);
        mainPanel.add(digitalOutputPanel);
        
        // Digital Input
        JPanel digitalInputPanel = new JPanel(new FlowLayout());
        digitalInputPanel.setBackground(Color.DARK_GRAY);
        JLabel digitalInputLabel = new JLabel("DIGITAL INPUT: ");
        JTextField digitalInputField = new JTextField("1", 5);
        digitalInputField.setHorizontalAlignment(JTextField.CENTER);
        digitalInputPanel.add(digitalInputLabel);
        digitalInputPanel.add(digitalInputField);
        mainPanel.add(digitalInputPanel);
        
        // Analog Input
        JPanel analogInputPanel = new JPanel(new FlowLayout());
        analogInputPanel.setBackground(Color.DARK_GRAY);
        JLabel analogInputLabel = new JLabel("ANALOG INPUT: ");
        JTextField analogInputField = new JTextField("230", 5);
        analogInputField.setHorizontalAlignment(JTextField.CENTER);
        analogInputPanel.add(analogInputLabel);
        analogInputPanel.add(analogInputField);
        mainPanel.add(analogInputPanel);
        
        // PWM Output
        JPanel pwmOutputPanel = new JPanel(new BorderLayout());
        pwmOutputPanel.setBackground(Color.DARK_GRAY);
        JLabel pwmLabel = new JLabel("PWM OUTPUT", SwingConstants.CENTER);
        pwmLabel.setForeground(Color.WHITE);
        JSlider pwmSlider = new JSlider(0, 255, 128);
        pwmSlider.setMajorTickSpacing(51);
        pwmSlider.setPaintTicks(true);
        pwmSlider.setPaintLabels(true);
        pwmOutputPanel.add(pwmLabel, BorderLayout.NORTH);
        pwmOutputPanel.add(pwmSlider, BorderLayout.CENTER);
        mainPanel.add(pwmOutputPanel);
        
        // Close Button
        JButton closeButton = new JButton("Cerrar");
        closeButton.addActionListener(e -> frame.dispose());
        mainPanel.add(closeButton);
        
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
 