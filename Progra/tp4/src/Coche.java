public class Coche  extends VehiculoTerrestre {

    public int cantPuertas;

    public Coche(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public Coche(int cantRuedas, int cantPuertas) {
        super(cantRuedas);
        this.cantPuertas = cantPuertas;
    }

    public Coche() {
    }

    public String mostrarTodo(){
        return "Auto: "+super.mostrarTodo() + " CantPuertas: " + cantPuertas;
    }
}
