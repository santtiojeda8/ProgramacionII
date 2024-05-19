public class Moto extends VehiculoTerrestre{

    public boolean embragueManual;

    public Moto() {
    }

    public Moto(boolean embragueManual) {
        this.embragueManual = embragueManual;
    }

    public Moto(int cantRuedas, boolean embragueManual) {
        super(cantRuedas);
        this.embragueManual = embragueManual;
    }
}
