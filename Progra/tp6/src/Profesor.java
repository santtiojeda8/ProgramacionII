import java.util.ArrayList;

public class Profesor extends Persona{
    public ArrayList<Asignatura> curso = new ArrayList<>();

    public Profesor(Integer legajo, String nombre, ArrayList<Asignatura> curso) {
        super(legajo, nombre);
        this.curso = curso;
    }

    public Profesor(Integer legajo, String nombre) {
        super(legajo, nombre);
    }

    public void setCurso (Asignatura asignatura) {
        curso.add(asignatura);
    }



}
