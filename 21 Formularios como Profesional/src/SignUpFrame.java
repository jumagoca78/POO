import java.awt.*;
import javax.swing.*;

/*
GridBagLayout es un administrador de diseño que permite colocar componentes en una cuadrícula de celdas, 
lo que permite un control más preciso sobre la posición y el tamaño de los componentes.
Cada componente se coloca en una celda de la cuadrícula y puede ocupar una o más celdas de la cuadrícula.
Los componentes se colocan en la cuadrícula utilizando un objeto GridBagConstraints que especifica la posición, 
el tamaño y otros atributos del componente.
Los componentes se agregan al contenedor utilizando el método add() con el objeto GridBagConstraints como argumento.
GridBagLayout es más flexible que otros administradores de diseño, pero también es más complicado de usar debido a la 
necesidad de configurar los objetos GridBagConstraints correctamente.
En general, se recomienda utilizar GridBagLayout cuando se necesita un control preciso sobre la posición y el tamaño de 
los componentes en un contenedor.

En este programa que significa
En este programa, se utiliza GridBagLayout para colocar los componentes en un marco de ventana de registro.
Se crea un objeto GridBagConstraints para especificar la posición y el tamaño de cada componente en la cuadrícula.
insets se utiliza para agregar un espacio entre los componentes y fill se utiliza para especificar cómo se debe redimensionar 
un componente si el tamaño de la celda es mayor que el tamaño del componente.
gridx y gridy se utilizan para especificar la posición de la celda en la cuadrícula, y gridwidth se utiliza para especificar
el número de celdas que debe ocupar el componente en la dirección x.
gridwith se utiliza para especificar el número de celdas que debe ocupar el componente en la dirección y.

Los componentes se agregan al marco de la ventana utilizando el método add() con el objeto GridBagConstraints como argumento.
Esto permite colocar los componentes en posiciones específicas en la ventana y controlar su tamaño y alineación.
Por ejemplo, el título "Sign Up" se coloca en la parte superior de la ventana con un tamaño de fuente grande y alineación a la izquierda.



 * 
 */

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
