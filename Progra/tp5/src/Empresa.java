import java.util.ArrayList;

public class Empresa {
    public String rSocial;
    public ArrayList<Trabajador> empleado = new ArrayList<>();

    public Empresa(ArrayList<Trabajador> empleado, String rSocial) {
        this.empleado = empleado;
        this.rSocial = rSocial;
    }

    public Empresa() {
    }

    public Empresa(ArrayList<Trabajador> empleado) {
        this.empleado = empleado;
    }

    public Empresa(String rSocial) {
        this.rSocial = rSocial;
    }

    public void setEmpleado(Trabajador empleado) {
        this.empleado.add(empleado);
    }

}
