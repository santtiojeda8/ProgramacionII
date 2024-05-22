import java.util.ArrayList;

public class Chofer {
    private String nombre;
    public ArrayList<Taxi> conduce = new ArrayList<>();

    public Chofer(String nombre) {
        this.nombre = nombre;
    }

    public Chofer(String nombre,Taxi taxi,Taxi taxi2,Taxi taxi3) {
        this.nombre = nombre;
        conduce.add(taxi);
        conduce.add(taxi2);
        conduce.add(taxi3);
    }

    public Chofer() {
    }

    public void setConduce(Taxi conduce){
        this.conduce.add(conduce);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int vencimientoLic(int fecha){
        return fecha-10;
    }


}
