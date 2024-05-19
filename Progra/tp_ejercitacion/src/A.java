public class A {
    private String nombre;

    public A() {
    }

    public A(String nombre) {
        this.nombre = nombre;
    }

    public String cocina (){
        return "Hoy cocina la "+nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
