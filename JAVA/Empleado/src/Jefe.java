public class Jefe extends Empleado{
    private int incentivo;

    public Jefe() {
    }

    public Jefe(String fechaAlta, String nombre, double sueldo, int incentivo) {
        super(fechaAlta, nombre, sueldo);
        this.incentivo = incentivo;
    }

    public int getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(int incentivo) {
        this.incentivo = incentivo;
    }
    public String mostrarTodo(){
        double aux=super.aumentarSalario()+incentivo;
        System.out.print("Nombre: "+getNombre());
        System.out.print(", Sueldo: "+aux);
        System.out.print(", Fecha de Alta: "+getFechaAlta());
        return "";
    }
}
