public class Avion extends VehiculoAereo{

    public int cantMotores;

    public Avion() {
    }

    public Avion(int cantMotores) {
        this.cantMotores = cantMotores;
    }

    public Avion(float alturaVuelo, int cantMotores) {
        super(alturaVuelo);
        this.cantMotores = cantMotores;
    }

    public String mostrarTodo(){
        return "Avion: "+super.mostrarTodo() + " Cantidad de Motores: " + cantMotores ;
    }
}
