import java.util.ArrayList;

public class EquipoNacional {
    private String pais;
    private String color;
    private ArrayList<Atleta> pertenece = new ArrayList<>();

    public EquipoNacional() {
    }

    public EquipoNacional(String color, String pais, ArrayList<Atleta> pertenece) {
        this.color = color;
        this.pais = pais;
        this.pertenece = pertenece;
    }

    public EquipoNacional(ArrayList<Atleta> pertenece) {
        this.pertenece = pertenece;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Atleta> getPertenece() {
        return pertenece;
    }

    public void setPertenece(ArrayList<Atleta> pertenece) {
        this.pertenece = pertenece;
    }

    public void setPertenece(Atleta pertenece) {
        this.pertenece.add(pertenece);
    }
}
