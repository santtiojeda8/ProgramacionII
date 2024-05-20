public abstract class Vehiculo implements Potencia {

    public String tipoCombustible;
    public float cantCombustible;

    abstract float VeloMaxima();
    abstract String mostrarTodo();

    public void desdePotencia(int posicion,int cantidad){
        if(posicion>=0 && posicion< Potencia.tipo_Combsutible.length){
            System.out.println("Tipo: "+Potencia.tipo_Combsutible[posicion-1]+". Cantidad Requerida: "+cantidad);
        }else{
            System.out.println("La posición del arregle no existe");
        }
    }
}
