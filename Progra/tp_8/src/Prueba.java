import java.util.ArrayList;

public class Prueba {
    private String codigo;
    private String titulo;
    private ArrayList<Instalacion> donde= new ArrayList<>();
    private ArrayList<Atleta> participa = new ArrayList<>();

    public Prueba(String codigo, ArrayList<Instalacion> donde, String titulo, ArrayList<Atleta> participa) {
        this.codigo = codigo;
        this.donde = donde;
        this.titulo = titulo;
        this.participa = participa;
    }

    public Prueba(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public Prueba() {}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Instalacion> getDonde() {
        return donde;
    }

    public void setDonde(ArrayList<Instalacion> donde) {
        this.donde = donde;
    }

    public ArrayList<Atleta> getParticipa() {
        return participa;
    }

    public void setParticipa(ArrayList<Atleta> participa) {
        this.participa = participa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setParticipa(Atleta participa) {
        this.participa.add(participa);
    }

    public void setDonde(Instalacion donde) {
        this.donde.add(donde);
    }
}
