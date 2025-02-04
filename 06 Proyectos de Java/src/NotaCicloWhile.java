/*
 * Este programa permite ingresar calificaciones de estudiantes de forma repetida 
 * hasta que el usuario ingrese -1, momento en el cual calcula y muestra el promedio. 
 * Si no se ingresan calificaciones, 
 * se muestra un mensaje indicando que no se ingresaron datos.
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class NotaCicloWhile {
    public static void main( String args[] ) {
        int gradeCounter,  // number of grades entered
            gradeValue,    // grade value
            total;        // sum of grades
        double average;   // average of all grades
        String input;     // grade typed by user

        // Initialization phase
        total = 0;        // clear total
        gradeCounter = 0; // prepare to loop

        // Processing phase
        // prompt for input and read grade from user
        input = JOptionPane.showInputDialog(
            "Enter Integer Grade, -1 to Quit:" );

        // convert grade from a String to an integer
        gradeValue = Integer.parseInt( input );

        while ( gradeValue != -1 ) {
            // add gradeValue to total
            total = total + gradeValue;

            // add 1 to gradeCounter
            gradeCounter = gradeCounter + 1;

            // prompt for input and read grade from user
            input = JOptionPane.showInputDialog(
                "Enter Integer Grade, -1 to Quit:" );

            // convert grade from a String to an integer
            gradeValue = Integer.parseInt( input );
        }

        // Termination phase
        DecimalFormat twoDigits = new DecimalFormat( "0.00" );

        if ( gradeCounter != 0 ) {
            average = (double) total / gradeCounter;

            // display average of exam grades
            JOptionPane.showMessageDialog( null,
                "Class average is " + twoDigits.format( average ),
                "Class Average",
                JOptionPane.INFORMATION_MESSAGE );
        } else {
            JOptionPane.showMessageDialog( null,
                "No grades were entered", "Class Average",
                JOptionPane.INFORMATION_MESSAGE );
        }

        System.exit( 0 ); // terminate the program
    }
        
}
