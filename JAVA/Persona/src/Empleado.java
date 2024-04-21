public class Empleado extends Persona{
    private double salario;

    public Empleado() {
    }

    public Empleado(String apellido, int edad, String nombre, double salario) {
        super(apellido, edad, nombre);
        this.salario = salario;
    }

    @Override
    public String getDesc() {
        return "Empleado";
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String mostrarTodo(){
        return super.mostrarTodo()+" "+salario;
    }
}
