public class Main {
    public static void main(String[] args) {
        Abuela a1 = new Abuela();
        Madre m1 = new Madre();
        Hija h1 = new Hija();
        //Llamamos al método cocina desde Abuela
        System.out.println(a1.cocina());
        //Llamamos al método superCocina desde la Madre
        System.out.println(m1.superCocina());
        //Llamamos al método superSuperCocina desde la Hija
        System.out.println(h1.superSuperCocina());
        //Llamamos al método de cocina desde Madre
        System.out.println(m1.cocina());
        //Llamamos al método superCocina desde Hija
        System.out.println(h1.superCocina());
    }
}