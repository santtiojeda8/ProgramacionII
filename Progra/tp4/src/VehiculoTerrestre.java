public class VehiculoTerrestre  extends Vehiculo {

    public int cantRuedas;

    @Override
    float VeloMaxima(){
        return 400F;
    }

    @Override
    String mostrarTodo(){
        return "Tipo de Combustible: "+super.tipoCombustible+" Cantidad de Combustible: "+super.cantCombustible+
                " Ruedas: " + cantRuedas;
    }

    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
    }

    public void setCantCombustible(int cantCombustible){
        this.cantCombustible=cantCombustible;
    }

    public VehiculoTerrestre() {
    }

    public VehiculoTerrestre(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    @Override
    public float capacidadMaxDeCarga() {
        return 0;
    }

}
