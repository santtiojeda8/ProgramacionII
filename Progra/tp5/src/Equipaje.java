public class Equipaje {
    private int peso;
    private String tipo;

    public Equipaje(String tipo, int peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
