public class Empleado implements Comparable, Trabajador{
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

    public String tipo(){
        return "Empleado";
    }

    public double aumentarSalario(){
        double sala_aumentado= sueldo+(sueldo*0.10);
        return sala_aumentado;
    }

    public String mostrarTodo(){
        return "Nombre: " + nombre + ", Sueldo: " + aumentarSalario() + ", Fecha Alta: " + fechaAlta+", Tipo: " + tipo();
    }


    public int compareTo(Object o) {
        Empleado emp = (Empleado) o;
        if (this.sueldo < emp.sueldo){
            return -1;
        }
        if (this.sueldo > emp.sueldo){
            return 1;
        }
        return 0;
    }

    public double estableceBonus(double bonus){
        return bonusMin+bonus;
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
