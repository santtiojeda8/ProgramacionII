public class Atleta {
    private Prueba participa;
    private String nombre;

    public Atleta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prueba getParticipa() {
        return participa;
    }

    public void setParticipa(Prueba participa) {
        this.participa = participa;
    }

    public Atleta(String nombre, Prueba participa) {
        this.nombre = nombre;
        this.participa = participa;
    }
}
