package BancoNacional;

public class cajaAhorro extends Cuenta{
    private double tasaInteres;


    public cajaAhorro(double saldo, Cliente cliente, double tasaInteres) {
        super(saldo, cliente);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String extraerEfectivo(double monto) {
        String mensaje;
        if (monto <= getSaldo()){
            setSaldo(getSaldo()-monto);
            mensaje = "Extraccion exitosa.";
            System.out.println(informarSaldo());
        }else {
            mensaje = "Saldo insuficiente";
            System.out.println(informarSaldo());
        }

        return mensaje;
    }

    public String cobrarInteres(){
        double intereses = (getSaldo()*(tasaInteres/100));
        setSaldo(getSaldo()+intereses);
        return "Se generaron "+intereses+" con los intereses, el dinero fue depositado en el saldo de su cuenta.";
    }
}
