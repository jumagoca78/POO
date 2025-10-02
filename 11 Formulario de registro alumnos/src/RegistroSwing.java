import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroSwing extends JFrame {
    private JTextField txtName, txtEmail, txtMatricula, txtBirthDate;
    private JPasswordField txtPassword;
    private JLabel lblMessage;

    public RegistroSwing() {
        setTitle("Registro de Alumno");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // Componentes del formulario
        add(new JLabel("Nombre:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Correo:"));
        txtEmail = new JTextField();
        add(txtEmail);

        add(new JLabel("Matrícula:"));
        txtMatricula = new JTextField();
        add(txtMatricula);

        add(new JLabel("Fecha de Nacimiento:"));
        txtBirthDate = new JTextField();
        add(txtBirthDate);

        add(new JLabel("Contraseña:"));
        txtPassword = new JPasswordField();
        add(txtPassword);

        JButton btnRegister = new JButton("Registrar");
        lblMessage = new JLabel("");
        add(btnRegister);
        add(lblMessage);

        // Acción del botón
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarRegistro();
            }
        });

        setVisible(true);
    }

    /*Método de validación de datos
        * Valida que los campos del formulario no estén vacíos
        * y muestra un mensaje en el JLabel lblMessage
    */
    public void validarRegistro() {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String matricula = txtMatricula.getText();
        String birthDate = txtBirthDate.getText();
        String password = new String(txtPassword.getPassword());

        if (name.isEmpty() || email.isEmpty() || matricula.isEmpty() || birthDate.isEmpty() || password.isEmpty()) {
            lblMessage.setText("Todos los campos son obligatorios.");
        } else {
            lblMessage.setText("Registro exitoso.");
        }
    }

    /*
     * Método para obtener el mensaje de validación que genera la funcion validarRegistro
     * y que se escribe en el JLabel lblMessage
     */

    // Métodos para acceder a los valores desde JUnit
    public String getValidationMessage() {
        return lblMessage.getText();
    }


    /*
     * Método para establecer los valores de los campos del formulario
     * desde JUnit
     * @param name Nombre del alumno a registrar
     * @param email Correo del alumno a registrar
     * @param matricula Matrícula del alumno a registrar
     * @param birthDate Fecha de nacimiento del alumno a registrar
     * @param password Contraseña del alumno a registrar
     * 
     */
    public void setFields(String name, String email, String matricula, String birthDate, String password) {
        txtName.setText(name);
        txtEmail.setText(email);
        txtMatricula.setText(matricula);
        txtBirthDate.setText(birthDate);
        txtPassword.setText(password);
    }

    public void clickRegisterButton() {
        validarRegistro();
    }

   


}