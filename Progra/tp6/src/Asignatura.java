public class Asignatura {
    private Integer codigo;
    public Profesor instructor;
    private String nombre;

    public Asignatura(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Asignatura() {
    }

    public Asignatura(Profesor instructor, Integer codigo, String nombre) {
        this.instructor = instructor;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Asignatura(Profesor instructor) {
        this.instructor = instructor;
    }

    public void setInstructor(Profesor instructor) {
        this.instructor = instructor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getInstructor() {
        return instructor;
    }
}
