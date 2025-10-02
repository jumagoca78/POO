import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InterfazTaller extends JFrame {
    private TallerdeSanta taller;
    private JTextField mesField, duendesField, produccionField;
    
    public InterfazTaller() {
        setTitle("Taller de Santa Claus");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        
        add(new JLabel("Ingrese el mes (1-12):"));
        mesField = new JTextField();
        add(mesField);
        
        add(new JLabel("Ingrese número de duendes:"));
        duendesField = new JTextField();
        add(duendesField);
        
        add(new JLabel("Producción Mensual:"));
        produccionField = new JTextField();
        produccionField.setEditable(false);
        add(produccionField);
        
        JButton agregarBtn = new JButton("Agregar Duende");
        JButton quitarBtn = new JButton("Quitar Duende");
        JButton iniciarBtn = new JButton("Iniciar Taller");
        
        add(agregarBtn);
        add(quitarBtn);
        add(iniciarBtn);
        
        agregarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AgregarDuende().ejecutar(taller);
                actualizarProduccion();
            }
        });
        
        quitarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new QuitarDuende().ejecutar(taller);
                actualizarProduccion();
            }
        });
        
        iniciarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int mes = Integer.parseInt(mesField.getText());
                int duendes = Integer.parseInt(duendesField.getText());
                taller = new TallerdeSanta(mes, duendes);
                actualizarProduccion();
            }
        });
    }
    
    private void actualizarProduccion() {
        duendesField.setText(String.valueOf(taller.getDuendesLaborando()));
        produccionField.setText(String.valueOf(new CalcularProduccion().ejecutar(taller)));
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazTaller().setVisible(true));
    }
}