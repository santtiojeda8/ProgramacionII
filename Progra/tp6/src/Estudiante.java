import java.util.HashMap;

public class Estudiante extends Persona{
    public HashMap<Integer,Inscripcion> formulario = new HashMap();

    public Estudiante(HashMap<Integer,Inscripcion> formulario,String nombre, Integer legajo) {
        super(legajo, nombre);
        this.formulario = formulario;

    }

    public Estudiante(Integer legajo, String nombre) {
        super(legajo, nombre);
    }

    public void setFormulario(Inscripcion inscripcion, int cod){
        formulario.put(cod,inscripcion);
    }

    public Inscripcion getFormulario(Integer indice){
        return formulario.get(indice);
    }
}
