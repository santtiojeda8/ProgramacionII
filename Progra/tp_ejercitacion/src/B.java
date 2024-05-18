public class B extends A{

    public B(String nombre) {
        super();
        this.setNombre(nombre);
    }

    public B() {
    }

    public String sgNombre(){
        return super.gNombre();
    }
}
