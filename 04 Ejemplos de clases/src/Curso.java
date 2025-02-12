<<<<<<< HEAD

import javax.swing.JOptionPane;

public class Curso {

    Estudiante[] estudiantes;

    //constructor del cursos solo si tengo 10 y hasta 45 estudiantes
    public Curso(Estudiante [] estudiantes) {
        if (estudiantes.length < 10 || estudiantes.length > 45) {
            JOptionPane.showMessageDialog(null, 
                                "El curso debe tener entre 10 y 45 estudiantes",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
        }
        else {
            this.estudiantes = estudiantes;
            JOptionPane.showMessageDialog(null, 
                                        "Felicidades tu curso fue abierto con exito",
                                        "Exito",
                                        JOptionPane.PLAIN_MESSAGE);
        }
    }
    
}
=======

import javax.swing.JOptionPane;

public class Curso {

    Estudiante[] estudiantes;

    //constructor del cursos solo si tengo 10 y hasta 45 estudiantes
    public Curso(Estudiante [] estudiantes) {
        if (estudiantes.length < 10 || estudiantes.length > 45) {
            JOptionPane.showMessageDialog(null, 
                                "El curso debe tener entre 10 y 45 estudiantes",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
        }
        else {
            this.estudiantes = estudiantes;
            JOptionPane.showMessageDialog(null, 
                                        "Felicidades tu curso fue abierto con exito",
                                        "Exito",
                                        JOptionPane.PLAIN_MESSAGE);
        }
    }
    
}
>>>>>>> 590cb17190b6c0570a325ad957a7cbb0342c21b9
