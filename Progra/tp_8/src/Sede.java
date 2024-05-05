public class Sede {
    private int fase;
    private String fecha;
    private String hora;
    private String codigo;

    public Sede() {
    }

    public Sede(String fecha, String hora, int fase, String codigo) {
        this.fecha = fecha;
        this.hora = hora;
        this.fase = fase;
        this.codigo = codigo;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
