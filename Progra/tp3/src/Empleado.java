public class Empleado {
    public String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Empleado() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int cocina(int cocina){
        return cocina+1;
    }

    public void cocina(){
        System.out.println("Cocina Empleado");
    }

    public void mostrarDatos(){
        System.out.println("Nombre "+ nombre);
        System.out.println("Edad "+ edad);
    }
}
