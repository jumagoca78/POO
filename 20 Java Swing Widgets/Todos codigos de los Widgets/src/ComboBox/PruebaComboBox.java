package ComboBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaComboBox extends JFrame {
    private JComboBox<String> comboImagenes;
    private JLabel etiquetaImagen;

    private String nombresImagenes[] = { "java", "java1","java2","java3"};
    private Icon iconos[] = { new ImageIcon("src/ComboBox/"+nombresImagenes[0]+".gif"),
                              new ImageIcon("src/ComboBox/"+nombresImagenes[1]+".gif"),
                              new ImageIcon("src/ComboBox/"+nombresImagenes[2]+".gif"),
                              new ImageIcon("src/ComboBox/java3.png") };

    public PruebaComboBox() {
        super("Prueba de JComboBox");
        setLayout(new FlowLayout());

        // Configurar JComboBox y registrar su manejador de eventos
        comboImagenes = new JComboBox<>(nombresImagenes);
        comboImagenes.setMaximumRowCount(3);
        comboImagenes.addItemListener(new ManejadorComboBox());

        add(comboImagenes);

        // Configurar JLabel para mostrar imágenes
        etiquetaImagen = new JLabel(iconos[3]);
        add(etiquetaImagen);

        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ManejadorComboBox implements ItemListener {
        public void itemStateChanged(ItemEvent evento) {
            if (evento.getStateChange() == ItemEvent.SELECTED) {
                etiquetaImagen.setIcon(iconos[comboImagenes.getSelectedIndex()]);
            }
        }
    }

    public static void main(String[] args) {
        new PruebaComboBox();
    }
}