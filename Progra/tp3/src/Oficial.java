public class Oficial extends Operario{

    public Oficial() {
    }

    public Oficial(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void cocina() {
        System.out.println("Cocina de Oficial");
    }

    @Override
    public void cocinaSuper(){
        System.out.println("cocinaSuper desde Oficial");
    }

    public void cocinaSuperSuper(){
        super.cocina();
    }

    public void cocinaSuperSuper(int cocina){
        System.out.println(super.cocina(cocina));
    }


}
