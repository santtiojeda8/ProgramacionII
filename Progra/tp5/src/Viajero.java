import java.util.ArrayList;

public class Viajero {
    private String nombre;
    private String sexo;
    public ArrayList<Equipaje> guarda = new ArrayList();

    public Viajero() {
    }

    public Viajero(ArrayList<Equipaje> guarda) {
        this.guarda = guarda;
    }

    public Viajero(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Viajero(ArrayList<Equipaje> guarda, String nombre, String sexo) {
        this.guarda = guarda;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Viajero(String nombre, String sexo,Equipaje equipaje, Equipaje equipaje2) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.guarda.add(equipaje);
        this.guarda.add(equipaje2);
    }

    public void setGuarda(Equipaje equipaje){
        this.guarda.add(equipaje);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
