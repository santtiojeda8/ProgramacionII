public class Jefe extends Empleado{
    private double incentivo;

    public Jefe(String apellido, int edad, String nombre, double salario, double incentivo) {
        super(apellido, edad, nombre, salario);
        this.incentivo = incentivo;
    }

    public Jefe() {
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
    public String getDesc(){
        return "Jefe";
    }
    public String mostrarTodo(){
        return super.mostrarTodo() +" "+ incentivo;
    }
}
