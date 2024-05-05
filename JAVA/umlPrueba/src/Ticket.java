public class Ticket {;
    private String nombreApellido;
    private double montoTotal;
    private double montoCadaCuota;

    public Ticket(double montoCadaCuota, double montoTotal, String nombreApellido) {
        this.montoCadaCuota = montoCadaCuota;
        this.montoTotal = montoTotal;
        this.nombreApellido = nombreApellido;
    }
}
