import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiqueta y campo de email
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Email address:"), gbc);

        gbc.gridx = 1;
        JTextField emailField = new JTextField(15);
        add(emailField, gbc);

        // Etiqueta y campo de contraseña
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(15);
        add(passwordField, gbc);

        // Botón de Login
        gbc.gridx = 0;
        gbc.gridy = 2;
        JButton loginButton = new JButton("LOGIN");
        add(loginButton, gbc);

        // Enlace de "Forgot password?"
        gbc.gridx = 1;
        JLabel forgotPassword = new JLabel("<html><a href='#'>Forgot password?</a></html>");
        forgotPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(forgotPassword, gbc);

        // Botón de Registro (Register)
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        JButton registerButton = new JButton("REGISTER");
        registerButton.setBackground(Color.LIGHT_GRAY);
        add(registerButton, gbc);

        // Acción del botón Register para abrir SignUpFrame
        registerButton.addActionListener((ActionEvent e) -> {
            new SignUpFrame();
            dispose(); // Cierra la ventana actual
        });

        setVisible(true);
    }
}
