import java.util.Date;

public class Inscripcion {
    private java.util.Date fecha;
    public Estudiante inscripto;
    public Asignatura en;

    public Inscripcion (Date fecha, Estudiante inscripto, String nombre, int codigo) {
        this.en = new Asignatura(codigo,nombre);
        this.fecha = fecha;
        this.inscripto = inscripto;
    }

    public Inscripcion(Estudiante inscripto){
        this.inscripto = inscripto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
