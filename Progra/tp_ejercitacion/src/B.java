public class B extends A{

    public B(String nombre) {
        super();
        this.setNombre(nombre);
    }

    public String superCocina(){
        super.cocina();
        return "Hoy cocina la "+ super.getNombre();
    }


}
