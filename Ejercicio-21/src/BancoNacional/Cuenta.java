package BancoNacional;

public abstract class Cuenta {

    private double saldo;
    private Cliente cliente;

    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String depositar(double monto){
        String mensaje;
        if (monto > 0){
            saldo+=monto;
            mensaje = "Se deposito correctamente la cantidad de "+monto+" en la cuenta";
            System.out.println(informarSaldo());
        }else {
            mensaje = "El monto para depositar que se introdujo es erroneo.";
        }
        return mensaje;
    }

    public abstract String extraerEfectivo(double monto);

    public String informarSaldo(){
        return "Su saldo actual es de "+getSaldo()+" pesos.";
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
