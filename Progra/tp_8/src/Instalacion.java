import java.util.ArrayList;

public class Instalacion {
    private String nombre;
    private String tipo;
    private String categoria;
    private String localizacion;
    private ArrayList<Prueba> seHace= new ArrayList<>();
    private ArrayList<Sede> sedes= new ArrayList<>();

    public Instalacion(String categoria, String tipo, String nombre, String localizacion) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    public Instalacion() {
    }

    public Instalacion(ArrayList<Prueba> seHace, ArrayList<Sede> sedes) {
        this.seHace = seHace;
        this.sedes = sedes;
    }

    public void setSeHace(Prueba seHace, Sede sedes){
        this.seHace.add(seHace);
        this.sedes.add(sedes);
    }
    public void setSede(Sede sedes){
        this.sedes.add(sedes);
    }
    public void setSeHace(Prueba seHace) {
        this.seHace.add(seHace);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public ArrayList<Prueba> getSeHace() {
        return seHace;
    }

    public void setSeHace(ArrayList<Prueba> seHace) {
        this.seHace = seHace;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
