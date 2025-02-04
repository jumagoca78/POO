
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
