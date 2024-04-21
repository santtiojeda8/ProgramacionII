public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String apellido, int edad, String nombre) {
        this.apellido = apellido;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Persona() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getDesc();

    public String mostrarTodo(){
        return nombre+" "+apellido+" "+edad+" "+getDesc();
    }
}
