public class Prueba {
    private int código;
    private String titulo;

    public Prueba(int código, String titulo) {
        this.código = código;
        this.titulo = titulo;
    }

    public Prueba() {
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
