import java.util.ArrayList;

public class Atleta implements Contrato{
    private String nombre;
    private String dni;
    private int edad;
    private float altura;
    private float peso;

    public Atleta(float altura, float peso, String nombre, int edad, String dni) {
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }



    public Atleta() {
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public float tomarPulsaciones() {
        return 110;
    }

    @Override
    public float calcularIMC(){
        float imc=(float)(peso/Math.pow(altura,2));
        return imc;
    }

    @Override
    public boolean hayPesoExtra(float imc) {
        if(imc>25 & imc<30){
            return true;
        }else{
            return false;
        }
    }


}
