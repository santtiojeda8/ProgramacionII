public class Empleado {
    private String nombre;
    private int sueldo;
    private int fechaAlta;

    public Empleado(int fechaAlta, String nombre, int sueldo) {
        this.fechaAlta = fechaAlta;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }

    public int getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(int fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
