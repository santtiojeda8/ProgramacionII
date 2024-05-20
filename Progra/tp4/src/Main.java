public class Main {
    public static void main(String[] args) {
        VehiculoAereo va1 = new VehiculoAereo(1200F);
        Avion a1 = new Avion(2400F,6);
        Helicoptero h1 = new Helicoptero(900F,10);
        VehiculoTerrestre vt1 = new VehiculoTerrestre(4);
        Coche c1 = new Coche(4,5);
        Moto m1 = new Moto(2,true);

        System.out.println(va1.VeloMaxima());
        System.out.println(vt1.VeloMaxima());
        vt1.setCantCombustible(50);
        vt1.setTipoCombustible("D");
        va1.setCantCombustible(1200);
        va1.setTipoCombustible("A");
        System.out.println(va1.mostrarTodo());
        System.out.println(vt1.mostrarTodo());
        System.out.println(c1.mostrarTodo());
        System.out.println(m1.mostrarTodo());
        System.out.println(a1.mostrarTodo());
        System.out.println(h1.mostrarTodo());
        System.out.println("Método Heredado: "+c1.VeloMaxima());
        System.out.println("Atributo Propio: "+c1.cantPuertas+" Atributo Heredado: "+c1.cantRuedas);
        vt1.desdePotencia(7,150);
        c1.desdePotencia(1,150);
    }
}
