## **3️⃣ JCheckBox - Casilla de Verificación**
Un **JCheckBox** permite seleccionar o deseleccionar una opción.

### **📌 Código Ejemplo**
```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxEjemplo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JCheckBox");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JCheckBox checkBox = new JCheckBox("Aceptar términos");
        checkBox.setBounds(80, 50, 150, 30);

        JButton boton = new JButton("Verificar");
        boton.setBounds(90, 90, 120, 30);

        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(80, 130, 200, 30);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    etiqueta.setText("✔ Aceptado");
                } else {
                    etiqueta.setText("✘ No aceptado");
                }
            }
        });

        frame.add(checkBox);
        frame.add(boton);
        frame.add(etiqueta);
        frame.setVisible(true);
    }
}
```