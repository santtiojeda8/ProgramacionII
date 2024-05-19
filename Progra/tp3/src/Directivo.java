public class Directivo extends Empleado{

    public Directivo(String nombre, int edad) {
        super(nombre, edad);
    }

    public Directivo() {
    }

    @Override
    public void cocina(){
        System.out.println("Cocina Directivo");
    }

    public void cocinaSuper(){
        super.cocina();
    }
}
