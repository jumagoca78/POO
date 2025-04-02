package BasesDeDatos;
import java.awt.event.*;
import java.security.MessageDigest;
import java.sql.*;
import javax.swing.*;

/**
 * Clase que permite actualizar registros en la base de datos SQLite.
 * Utiliza SHA-256 para comparar nombre y apellido encriptados.
 */
public class ActualizarRegistroEnc implements ActionListener {
    private JTextField[] campos;

    public ActualizarRegistroEnc(JTextField[] campos) {
        this.campos = campos;
    }

    /**
     * Encripta una cadena de texto utilizando SHA-256.
     * @param texto Texto plano.
     * @return Hash en formato hexadecimal.
     */
    private String encriptarSHA256(String texto) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(texto.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (Exception ex) {
            return texto; // fallback no recomendado en producción
        }
    }

    /**
     * Acción ejecutada cuando se presiona el botón "Actualizar".
     * Busca por nombre y apellido encriptados y actualiza los datos.
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        String nombre = campos[0].getText();
        String apellido = campos[1].getText();

        if (nombre.isEmpty() || apellido.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar nombre y apellido para actualizar.");
            return;
        }

        try (Connection conexion = DriverManager.getConnection("jdbc:sqlite:direcciones.db")) {
            // SQL para actualizar los campos restantes
            String sql = "UPDATE addresses SET "
                       + "address = ?, city = ?, stateorprovince = ?, postalcode = ?, "
                       + "country = ?, emailaddress = ?, homephone = ?, faxnumber = ? "
                       + "WHERE firstname = ? AND lastname = ?";

            try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
                // Setear los campos que serán actualizados
                for (int i = 2; i < campos.length; i++) {
                    stmt.setString(i - 1, campos[i].getText());
                }

                // Criterios de búsqueda: nombre y apellido encriptados
                stmt.setString(9, encriptarSHA256(nombre));
                stmt.setString(10, encriptarSHA256(apellido));

                int filasActualizadas = stmt.executeUpdate();
                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el registro a actualizar.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar registro: " + e.getMessage());
        }
    }
}
