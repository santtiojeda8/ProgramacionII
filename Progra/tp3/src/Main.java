public class Main {
    public static void main(String[] args) {
        /*
        A a1=new A("5",1);
        System.out.println(a1.sumar(7));
        B b1= new B("1",2,'3');
        System.out.println(b1.sumar(7));
        System.out.println(b1.sumar(7,3));
         */

        Empleado e1 = new Empleado("Sol",19);
        Directivo d1 = new Directivo("Agus",20);
        Operario op1= new Operario("Martin",21);
        Oficial of1 = new Oficial("Santi",20);

        d1.cocinaSuper();
        of1.cocinaSuperSuper(7);
        op1.cocinaSuper(9);
        of1.setEdad(21);
        System.out.println(op1.getEdad());
    }
}