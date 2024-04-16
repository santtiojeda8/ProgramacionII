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
        //Llamamos al método de cocina Abuele desde Madre
        System.out.println(m1.cocina());
        //Llamamos al método de superCocina Madre  desde Hija
        System.out.println(h1.superCocina());
        //Llamamos la método de cocina Abuela desde Hija
        System.out.println(h1.cocina());
    }
}