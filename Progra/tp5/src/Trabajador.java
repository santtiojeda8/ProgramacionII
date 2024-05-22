import java.util.ArrayList;

public class Trabajador {
    public int dni;
    private Empresa empleador;

    public Trabajador(int dni) {
        this.dni = dni;
    }

    public Trabajador() {
    }

    public Trabajador(int dni, Empresa empleador) {
        this.dni = dni;
        this.empleador = empleador;
    }


    public Empresa getEmpleador() {
        return empleador;
    }

    public void setEmpleador(Empresa empleador) {
        this.empleador = empleador;
    }

}
