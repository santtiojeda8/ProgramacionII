public class Main {
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona p1 = new Persona("94205043","ojedasi2004@gmail.com","Ojeda","Santiago","2616852245");
        TarjetaDeCredito t1 = new TarjetaDeCredito(EntidadFinanciera.CASTERMARD,"FakeBank","12345679",p1,15000);

        System.out.println("Tarjeta antes de pagar");
        System.out.println(t1);

        System.out.println("Ticket de pago");
        Ticket ticketGenerado = posnet.efectuarPago(t1,10000,5);
        System.out.println(ticketGenerado);

        System.out.println("Tarjeta despues de Pagar");
        System.out.println(t1);

    }
}