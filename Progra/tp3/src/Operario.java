public class Operario extends Empleado{

    public Operario() {
    }

    public Operario(String nombre, int edad) {
        super(nombre, edad);
    }

    public void cocinaSuper(){
        super.cocina();
    }

    public void cocinaSuper(int cocina){
        System.out.println(super.cocina(cocina));
    }

    @Override
    public void cocina(){
        System.out.println("Cocina de Operario");
    }
}
