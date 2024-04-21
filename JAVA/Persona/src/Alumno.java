public class Alumno extends Persona{
    private String carrera;
    public Alumno(String apellido, int edad, String nombre,String carrera) {
        super(apellido, edad, nombre);
        this.carrera=carrera;
    }

    public Alumno() {
    }

    @Override
    public String getDesc() {
        return "Alumno";
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String mostrarTodo(){
        return super.mostrarTodo()+" "+carrera ;
    }
}
