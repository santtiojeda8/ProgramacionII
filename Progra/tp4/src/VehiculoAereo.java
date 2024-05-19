public class VehiculoAereo extends Vehiculo{

    public float alturaVuelo;

    @Override
    float VeloMaxima(){
        return 1200F;
    }

    public VehiculoAereo(float alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }

    public VehiculoAereo() {
    }
}
