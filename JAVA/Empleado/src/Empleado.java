public class Empleado {
    private String nombre;
    private double sueldo;
    private String fechaAlta;

    public Empleado(String fechaAlta, String nombre, double sueldo) {
        this.fechaAlta = fechaAlta;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String mostrarTodo(){
        return "Nombre: " + nombre + ", Sueldo: " + sueldo + ", Fecha Alta: " + fechaAlta;
    }
    public double aumentarSalario(){
        double sala_aumentado= sueldo+(sueldo*0.10);
        return sala_aumentado;
    }

    // Esta es una forma de poder mostrar todos los datos en un solo método
    /*
    public String MostrarTodo(){
        System.out.println(aumentarSalario(sueldo));
        System.out.println(sueldo);
        System.out.println(nombre);
        System.out.println(fechaAlta);
        return "";
    }
    */
}
