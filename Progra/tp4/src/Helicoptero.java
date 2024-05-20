public class Helicoptero extends VehiculoAereo{

    public int cantPersonas;

    public Helicoptero() {
    }

    public Helicoptero(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Helicoptero(float alturaVuelo, int cantPersonas) {
        super(alturaVuelo);
        this.cantPersonas = cantPersonas;
    }

    public String mostrarTodo(){
        return "Helicoptero "+ super.mostrarTodo() + " Embrague Manual: " + cantPersonas;
    }

}
