public class Main {
    public static void main(String[] args) {
        A a = new A("Santi");
        B b = new B("Octi");
        C c = new C("Lore");
        System.out.println(a.getNombre());
        System.out.println(b.getNombre());
        System.out.println(c.getNombre());

        System.out.println(b.superCocina());
        System.out.println(c.superSuperCocina());
    }
}
