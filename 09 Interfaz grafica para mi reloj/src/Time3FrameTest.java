/*
 * Clase Time3FrameTest
 * Clase que contiene el método main para ejecutar la aplicación en JFrame
 * 
 * Se agregó setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);: Para que la ventana se cierre correctamente.
 */

 import javax.swing.JFrame;

 public class Time3FrameTest{
     // Método principal para ejecutar la aplicación en JFrame
     public static void main(String[] args) {
         Time3Frame frame = new Time3Frame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(400, 200);
         frame.setVisible(true);
     } 
 }