public class Furgoneta extends Auto{
    private int capacidad_de_carga;
    private int plazas_extra;

    public Furgoneta() {
    }

    public Furgoneta(int alto, int ancho, String color, int peso_total, int peso_chasis, float motor, int ruedas) {
        super(alto, ancho, color, peso_total, peso_chasis, motor, ruedas);
    }
    public Furgoneta(int capacidad_de_carga,int plazas_extra) {
        this.capacidad_de_carga = capacidad_de_carga;
        this.plazas_extra = plazas_extra;
    }

    public int getCapacidad_de_carga() {
        return capacidad_de_carga;
    }

    public void setCapacidad_de_carga(int capacidad_de_carga) {
        this.capacidad_de_carga = capacidad_de_carga;
    }

    public int getPlazas_extra() {
        return plazas_extra;
    }

    public void setPlazas_extra(int plazas_extra) {
        this.plazas_extra = plazas_extra;
    }

    public String superTodo(){
        super.todo();
        System.out.println("Capacidad de Carga: "+capacidad_de_carga);
        System.out.println("Plazas Extras: "+plazas_extra);
        return "";
    }
}
