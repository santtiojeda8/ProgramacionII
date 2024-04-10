public class Auto {
    private String color;
    private float peso_chasis;
    private float alto;
    private float ancho;
    private int ruedas;
    private float motor;
    private int peso_total;
    private boolean aireAcondicionado,asientosCuero;

    public Auto() {
        color= "Blue";
        peso_chasis= 1500F;
        alto= 100F;
        ancho= 150F;
        ruedas= 4;
    }

    public Auto(float alto, float ancho, String color, float peso_chasis, int ruedas) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        this.peso_chasis = peso_chasis;
        this.ruedas= ruedas;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso_chasis;
    }

    public void setPeso(float peso) {
        this.peso_chasis = peso;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public void setMotor(float motor){
        this.motor = motor;
    }
    public float getMotor(){
        return motor;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAsientosCuero() {
        return asientosCuero;
    }

    public void setAsientosCuero(boolean asientosCuero) {
        this.asientosCuero = asientosCuero;
    }

    public int getPeso_total() {
        return peso_total;
    }

    public void setPeso_total(int peso_total) {
        this.peso_total = peso_total;
    }
    public String mostrarTodo(){
        return "Ruedas "+ruedas+" Peso de Chasis "+peso_chasis+" Ancho "+ancho;
    }

}
