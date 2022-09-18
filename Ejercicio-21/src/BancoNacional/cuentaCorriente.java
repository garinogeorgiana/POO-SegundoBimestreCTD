package BancoNacional;

public class cuentaCorriente extends Cuenta{
    private double maxGiroDescubierto;

    public cuentaCorriente(double saldo, Cliente cliente, double maxGiroDescubierto) {
        super(saldo, cliente);
        this.maxGiroDescubierto = maxGiroDescubierto;
    }

    @Override
    public String extraerEfectivo(double monto) {
        String mensaje;
        if (monto <= getSaldo()+maxGiroDescubierto){
            setSaldo(getSaldo()-monto);
            mensaje = "Operacion exitosa.";
            System.out.println(informarSaldo());
        }else {
            mensaje = "Saldo insuficiente";
            System.out.println(informarSaldo());
        }

        return mensaje;
    }



}
