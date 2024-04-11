public class Hija extends Madre{
    private String nombre="Hija";
    public String superSuperCocina(){
        super.cocina();
        return "Hoy cocina la "+nombre;
    }

}
