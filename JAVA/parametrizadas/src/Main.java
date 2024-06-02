public class Main {
    public static void main(String[] args) {
        Box caja = new Box();
        caja.add(12);
        caja.add(13);
        caja.add(14);

        System.out.println(caja.get());
    }
}