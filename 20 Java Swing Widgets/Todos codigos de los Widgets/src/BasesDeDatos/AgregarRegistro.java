package BasesDeDatos;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AgregarRegistro implements ActionListener {
    private JTextField[] campos;

    public AgregarRegistro(JTextField[] campos) {
        this.campos = campos;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        try (Connection conexion = DriverManager.getConnection("jdbc:sqlite:direcciones.db")) {
            String sql = "INSERT INTO addresses (firstname, lastname, address, city, stateorprovince, postalcode, country, emailaddress, homephone, faxnumber)" +
                          "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
                for (int i = 0; i < campos.length; i++) {
                    stmt.setString(i + 1, campos[i].getText());
                }

                int filasInsertadas = stmt.executeUpdate();
                if (filasInsertadas > 0) {
                    JOptionPane.showMessageDialog(null, "Registro agregado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo agregar el registro");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar registro: " + e.getMessage());
        }
    }
}
