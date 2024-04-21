public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Furgoneta f1 = new Furgoneta(120,180,"Rojo",1800,1200,1.2F,4);
        Auto a1 = new Auto(110,190,"Azul",1900,1300,1.8F,4);
        System.out.println("Auto");
        System.out.println(a1.todo());
        f1.setPlazas_extra(3);
        f1.setCapacidad_de_carga(900);
        f1.setColor("Gris");
        System.out.println("Furgoneta");
        System.out.println(f1.superTodo());
    }
}