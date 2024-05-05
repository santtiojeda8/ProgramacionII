public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String DNI;

    public Persona(String DNI, String correo, String apellido, String nombre, String telefono) {
        this.DNI = DNI;
        this.correo = correo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona() {
    }
}
