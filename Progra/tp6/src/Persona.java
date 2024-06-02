import java.util.ArrayList;

public abstract class Persona {
    protected String nombre;
    public Integer legajo;

    public Persona(Integer legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public Persona(Integer legajo) {
        this.legajo = legajo;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

}
