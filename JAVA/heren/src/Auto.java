public class Auto {
    private String color;
    private int peso_chasis;
    private int alto;
    private int ancho;
    private int ruedas;
    private float motor;
    private int peso_total;

    public Auto() {
    }

    public Auto(int alto, int ancho, String color, int peso_total, int peso_chasis, float motor, int ruedas) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        this.peso_total = peso_total;
        this.peso_chasis = peso_chasis;
        this.motor = motor;
        this.ruedas = ruedas;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public int getPeso_chasis() {
        return peso_chasis;
    }

    public void setPeso_chasis(int peso_chasis) {
        this.peso_chasis = peso_chasis;
    }

    public int getPeso_total() {
        return peso_total;
    }

    public void setPeso_total(int peso_total) {
        this.peso_total = peso_total;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public String todo(){
        System.out.println("Alto: "+alto);
        System.out.println("Ancho: "+ancho);
        System.out.println("Color: "+color);
        System.out.println("Peso Total: "+peso_total);
        System.out.println("Peso Chasis: "+peso_chasis);
        System.out.println("Motor: "+motor);
        System.out.println("Ruedas: "+ruedas);
        return "";
    }
}
