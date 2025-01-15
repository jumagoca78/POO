import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapesGUI extends JFrame {

    public ShapesGUI() {
        // Configurar la ventana principal
        setTitle("Formas Geométricas");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3)); // Diseño en una cuadrícula

        // Crear las formas (paneles con colores y botones)
        add(createShapePanel("Cuadrado", Color.BLUE));
        add(createShapePanel("Círculo", Color.RED));
        add(createShapePanel("Triángulo", Color.GREEN));

        // Hacer la ventana visible
        setVisible(true);
    }

    // Método para crear un panel con una forma geométrica
    private JPanel createShapePanel(String shapeName, Color color) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Dibujar la forma
        JPanel shape = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(color);
                if (shapeName.equals("Cuadrado")) {
                    g.fillRect(50, 30, 100, 100); // Dibujar un cuadrado
                } else if (shapeName.equals("Círculo")) {
                    g.fillOval(50, 30, 100, 100); // Dibujar un círculo
                } else if (shapeName.equals("Triángulo")) {
                    int[] xPoints = {100, 50, 150};
                    int[] yPoints = {30, 130, 130};
                    g.fillPolygon(xPoints, yPoints, 3); // Dibujar un triángulo
                }
            }
        };
        shape.setPreferredSize(new Dimension(200, 150));

        // Crear el botón
        JButton button = new JButton("Rotar & Sonido");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rotateShape(shapeName);
                playSound(shapeName);
            }
        });

        // Añadir la forma y el botón al panel
        panel.add(shape, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        return panel;
    }

    // Método para simular la rotación de la forma
    private void rotateShape(String shapeName) {
        System.out.println("Rotando " + shapeName + " 360°");
    }

    // Método para simular la reproducción de sonido
    private void playSound(String shapeName) {
        System.out.println("Reproduciendo sonido AIF para " + shapeName);
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ShapesGUI());
    }
}
