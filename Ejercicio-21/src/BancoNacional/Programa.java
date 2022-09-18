package BancoNacional;

public class Programa {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1,"Cristaldo",3333333,"A-3333333-A");
        cajaAhorro cajaAhorro1 = new cajaAhorro(5000d,cliente1,10d);
        System.out.println(cliente1.getApellido());
        System.out.println(cajaAhorro1.informarSaldo());
        System.out.println(cajaAhorro1.depositar(100.0));
        System.out.println(cajaAhorro1.extraerEfectivo(500d));
        System.out.println(cajaAhorro1.cobrarInteres());

    }
}
