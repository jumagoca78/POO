import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommunitySignUpFrame extends JFrame {

    private JCheckBox termsCheckBox;
    private JButton joinButton;
    private JLabel warningLabel;

    public CommunitySignUpFrame() {
        setTitle("Join the Community");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Título
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        JLabel titleLabel = new JLabel("<html><b>Brief introduction</b> (optional)</html>");
        add(titleLabel, gbc);

        // Descripción
        gbc.gridy = 1;
        JLabel descriptionLabel = new JLabel("<html>Please write a few sentences about yourself so others will get to know you.</html>");
        add(descriptionLabel, gbc);

        // Área de texto para la introducción
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        JTextArea introTextArea = new JTextArea(5, 30);
        introTextArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(new JScrollPane(introTextArea), gbc);

        // Casilla de verificación de términos y política de datos
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        termsCheckBox = new JCheckBox("I have read and accept ");
        
        // Etiquetas con enlaces simulados
        JLabel termsLabel = new JLabel("<html><a href='#'>Terms of Use</a></html>");
        termsLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JLabel policyLabel = new JLabel(" and the ");
        JLabel dataPolicyLabel = new JLabel("<html><a href='#'>Data Policy</a></html>");
        dataPolicyLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JPanel termsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        termsPanel.add(termsCheckBox);
        termsPanel.add(termsLabel);
        termsPanel.add(policyLabel);
        termsPanel.add(dataPolicyLabel);
        
        add(termsPanel, gbc);

        // Mensaje de advertencia
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        warningLabel = new JLabel("<html><font color='red'>You need to read and accept our Terms of Use and Data Policy to join</font></html>");
        warningLabel.setVisible(false);
        add(warningLabel, gbc);

        // Botón de registro
        gbc.gridy = 5;
        joinButton = new JButton("JOIN THE COMMUNITY");
        joinButton.setEnabled(false); // Deshabilitado hasta aceptar términos
        joinButton.setBackground(Color.BLUE);
        joinButton.setForeground(Color.WHITE);
        add(joinButton, gbc);

        // Listeners para manejar la habilitación del botón y advertencias
        termsCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean accepted = termsCheckBox.isSelected();
                joinButton.setEnabled(accepted);
                warningLabel.setVisible(!accepted);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CommunitySignUpFrame();
    }
}

