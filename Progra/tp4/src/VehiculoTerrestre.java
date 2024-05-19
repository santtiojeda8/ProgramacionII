public class VehiculoTerrestre  extends Vehiculo {

    public int cantRuedas;

    @Override
    float VeloMaxima(){
        return 400F;
    }

    public VehiculoTerrestre() {
    }

    public VehiculoTerrestre(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
}
