public class Main {
    public static void main(String[] args) {
        VehiculoAereo va1 = new VehiculoAereo(1200F);
        Avion a1 = new Avion(2400F,6);
        Helicoptero h1 = new Helicoptero(900F,10);
        VehiculoTerrestre vt1 = new VehiculoTerrestre(4);
        Coche c1 = new Coche(4,5);
        Moto mo1 = new Moto(2,true);

        System.out.println(va1.VeloMaxima());
        System.out.println(vt1.VeloMaxima());
    }
}
