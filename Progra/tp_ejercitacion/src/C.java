public class C extends B {

    public C(String nombre) {
        super(nombre);
    }

    public String superSuperCocina(){
        super.cocina();
        return "Hoy cocina la "+super.getNombre();
    }

}
