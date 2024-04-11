public class Madre extends Abuela{
    private String nombre="Madre";
    public String superCocina(){
        super.cocina();
        return "Hoy cocina la "+nombre;
    }
}
