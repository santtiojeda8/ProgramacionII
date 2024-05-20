public class VehiculoAereo extends Vehiculo{

    public float alturaVuelo;

    @Override
    float VeloMaxima(){
        return 1200F;
    }

    @Override
    String mostrarTodo(){
        return "Tipo de Combustible: "+super.tipoCombustible+" Cantidad de Combustible: "+super.cantCombustible+
                " Altura de Vuelo: " + alturaVuelo;
    }

    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
    }

    public void setCantCombustible(int cantCombustible){
        this.cantCombustible=cantCombustible;
    }

    public VehiculoAereo(float alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }

    public VehiculoAereo() {

    }
    
    @Override
    public float capacidadMaxDeCarga() {
        return 0;
    }
}
