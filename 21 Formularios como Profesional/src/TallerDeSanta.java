import java.awt.*;
import javax.swing.*;

class TallerDeSanta {
    private int duendesLaborando;
    private int mes;
    private static final int PRODUCCION_POR_DUENDE = 10;

    public TallerDeSanta() {
        this.mes = 1;
        this.duendesLaborando = maximoDuendesMes(this.mes);
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
            this.duendesLaborando = maximoDuendesMes(mes);
        } else {
            JOptionPane.showMessageDialog(null, "Mes inválido. Debe estar entre 1 y 12.");
        }
    }

    public void setDuendesLaborando(int duendes) {
        int maximo = maximoDuendesMes(this.mes);
        if (duendes >= 1 && duendes <= maximo) {
            this.duendesLaborando = duendes;
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad de duendes inválida. Debe estar entre 1 y " + maximo);
        }
    }

    public int produccionMensual() {
        return duendesLaborando * PRODUCCION_POR_DUENDE;
    }

    public void agregarDuende() {
        int maximo = maximoDuendesMes(this.mes);
        if (duendesLaborando < maximo) {
            duendesLaborando++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más duendes. Límite alcanzado.");
        }
    }

    public void quitarDuende() {
        if (duendesLaborando > 1) {
            duendesLaborando--;
        } else {
            JOptionPane.showMessageDialog(null, "Debe haber al menos 1 duende trabajando.");
        }
    }

    public int maximoDuendesMes(int mes) {
        return mes * 10;
    }

    public int getDuendesLaborando() {
        return duendesLaborando;
    }

    public int getMes() {
        return mes;
    }
}

class TallerDeSantaGUI extends JFrame {
    private TallerDeSanta taller;
    private JTextField txtMes, txtDuendes, txtProduccion;
    private JButton btnAgregar, btnQuitar;

    public TallerDeSantaGUI() {
        taller = new TallerDeSanta();

        setTitle("Taller de Santa Claus");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        // Campo para ingresar el mes
        add(new JLabel("Ingrese el mes (1-12):"));
        txtMes = new JTextField();
        add(txtMes);

        // Evento para reaccionar al presionar "Enter"
        txtMes.addActionListener(e -> actualizarMes());

        // Campo para ingresar el número de duendes
        add(new JLabel("Ingrese número de duendes:"));
        txtDuendes = new JTextField();
        add(txtDuendes);

        // Evento para reaccionar al presionar "Enter"
        txtDuendes.addActionListener(e -> actualizarDuendes());

        // Campo deshabilitado para mostrar la producción
        add(new JLabel("Producción Mensual:"));
        txtProduccion = new JTextField();
        txtProduccion.setEditable(false);
        add(txtProduccion);

        // Botón para agregar duendes
        btnAgregar = new JButton("Agregar Duende");
        btnAgregar.addActionListener(e -> {
            taller.agregarDuende();
            actualizarTexto();
        });
        add(btnAgregar);

        // Botón para quitar duendes
        btnQuitar = new JButton("Quitar Duende");
        btnQuitar.addActionListener(e -> {
            taller.quitarDuende();
            actualizarTexto();
        });
        add(btnQuitar);

        setVisible(true);
    }

    private void actualizarMes() {
        try {
            int mes = Integer.parseInt(txtMes.getText());
            taller.setMes(mes);
            actualizarTexto();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el mes.");
        }
    }

    private void actualizarDuendes() {
        try {
            int duendes = Integer.parseInt(txtDuendes.getText());
            taller.setDuendesLaborando(duendes);
            actualizarTexto();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para los duendes.");
        }
    }

    private void actualizarTexto() {
        txtMes.setText(String.valueOf(taller.getMes()));
        txtDuendes.setText(String.valueOf(taller.getDuendesLaborando()));
        txtProduccion.setText(String.valueOf(taller.produccionMensual()));
    }

    public static void main(String[] args) {
        new TallerDeSantaGUI();
    }
}
