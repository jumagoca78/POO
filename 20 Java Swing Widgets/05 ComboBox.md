# Explicación de ComboBoxTest.java en Java Swing

## Descripción
Este programa demuestra el uso de `JComboBox` en una interfaz gráfica de usuario en **Java Swing**. Permite seleccionar una imagen de una lista desplegable y cambiar dinámicamente la imagen mostrada en la interfaz.
<img alt="Ejemplo de tipos de campos de texto" src="https://github.com/jumagoca78/POO/blob/main/20%20Java%20Swing%20Widgets/Todos%20codigos%20de%20los%20Widgets/imagenes/ComboBox.jpg">


## Funcionamiento
1. **Configuración de la interfaz gráfica (`JFrame`)**  
   - Se crea una ventana utilizando `JFrame`.
   - Se usa un diseño de `FlowLayout` para organizar los componentes.

2. **Creación del `JComboBox`**  
   - `JComboBox` almacena una lista de nombres de archivos de imágenes.
   - Se permite que el combo box muestre hasta 3 elementos a la vez (`setMaximumRowCount(3)`).

3. **Manejo de eventos (`ItemListener`)**  
   - Se usa un `ItemListener` anónimo para detectar cambios en la selección del `JComboBox`.
   - Cuando el usuario selecciona un elemento, se actualiza la imagen mostrada en el `JLabel`.

4. **Mostrar imágenes en un `JLabel`**  
   - Se inicializa un `JLabel` con una imagen predeterminada.
   - Al seleccionar una nueva imagen en el `JComboBox`, la imagen en el `JLabel` se actualiza.

## Código en Java Swing (original)
```java
// Fig. 13.13: ComboBoxTest.java
// Using a JComboBox to select an image to display.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxTest extends JFrame {
   private JComboBox imagesComboBox;
   private JLabel label;

   private String names[] = 
      { "bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif" };
   private Icon icons[] = { new ImageIcon( names[ 0 ] ),
      new ImageIcon( names[ 1 ] ), new ImageIcon( names[ 2 ] ),
      new ImageIcon( names[ 3 ] ) };

   // set up GUI
   public ComboBoxTest()
   {
      super( "Testing JComboBox" );
    
      // get content pane and set its layout
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );      

      // set up JComboBox and register its event handler
      imagesComboBox = new JComboBox( names );
      imagesComboBox.setMaximumRowCount( 3 );
      imagesComboBox.addItemListener(

         new ItemListener() {  // anonymous inner class 

            // handle JComboBox event
            public void itemStateChanged( ItemEvent event )
            {
               // determine whether check box selected
			   if ( event.getStateChange() == ItemEvent.SELECTED )
                  label.setIcon( icons[ 
                     imagesComboBox.getSelectedIndex() ] );
            }

         }  // end anonymous inner class

      ); // end call to addItemListener

      container.add( imagesComboBox );

      // set up JLabel to display ImageIcons
      label = new JLabel( icons[ 0 ] );
      container.add( label );

      setSize( 350, 100 );
      setVisible( true );

   } // end ComboBoxTest constructor

   public static void main( String args[] )
   { 
      ComboBoxTest application = new ComboBoxTest();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // end class ComboBoxTest

```

## Ejecución
Para ejecutar este programa, compílalo con `javac ComboBoxTest.java` y luego ejecútalo con `java ComboBoxTest`. **Asegúrate de que las imágenes existan en el mismo directorio del código.**

