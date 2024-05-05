public class TarjetaDeCredito {
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    public TarjetaDeCredito(EntidadFinanciera entidadFinanciera, String entidadBancaria, String numeroTarjeta, Persona titular, double saldo) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public TarjetaDeCredito() {
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "entidadBancaria='" + entidadBancaria + '\'' +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                ", saldo=" + saldo +
                ", entidadFinanciera=" + entidadFinanciera +
                ", titular=" + titular +
                '}';
    }
}
