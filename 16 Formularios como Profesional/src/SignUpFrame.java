import java.awt.*;
import javax.swing.*;

public class SignUpFrame extends JFrame {

    public SignUpFrame() {
        setTitle("Sign Up");
        setSize(350, 450);
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
        JLabel title = new JLabel("Sign Up", SwingConstants.LEFT);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, gbc);

        // Campos de nombre y apellido
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(new JLabel("First name:"), gbc);
        gbc.gridx = 1;
        JTextField firstNameField = new JTextField(12);
        add(firstNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Last name:"), gbc);
        gbc.gridx = 1;
        JTextField lastNameField = new JTextField(12);
        add(lastNameField, gbc);

        // Campo de email/teléfono
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(new JLabel("Mobile number or email:"), gbc);

        gbc.gridy = 4;
        JTextField emailField = new JTextField(20);
        add(emailField, gbc);

        // Campo de contraseña
        gbc.gridy = 5;
        add(new JLabel("New password:"), gbc);

        gbc.gridy = 6;
        JPasswordField passwordField = new JPasswordField(20);
        add(passwordField, gbc);

        // Fecha de nacimiento
        gbc.gridy = 7;
        add(new JLabel("Birthday:"), gbc);

        gbc.gridy = 8;
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        JComboBox<String> monthBox = new JComboBox<>(months);
        JComboBox<Integer> dayBox = new JComboBox<>();
        JComboBox<Integer> yearBox = new JComboBox<>();

        for (int i = 1; i <= 31; i++) dayBox.addItem(i);
        for (int i = 1920; i <= 2025; i++) yearBox.addItem(i);

        JPanel birthdayPanel = new JPanel();
        birthdayPanel.add(monthBox);
        birthdayPanel.add(dayBox);
        birthdayPanel.add(yearBox);
        add(birthdayPanel, gbc);

        // Género
        gbc.gridy = 9; //gridy se usa para la posición en la cuadrícula de la celda actual en este caso la fila 9
        add(new JLabel("Gender:"), gbc);

        gbc.gridy = 10;
        JPanel genderPanel = new JPanel();
        JRadioButton female = new JRadioButton("Female");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton custom = new JRadioButton("Custom");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(female);
        genderGroup.add(male);
        genderGroup.add(custom);
        genderPanel.add(female);
        genderPanel.add(male);
        genderPanel.add(custom);
        add(genderPanel, gbc);

        // Botón de Registro
        gbc.gridy = 11;
        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBackground(Color.GREEN);
        add(signUpButton, gbc);

        setVisible(true);
    }
}
