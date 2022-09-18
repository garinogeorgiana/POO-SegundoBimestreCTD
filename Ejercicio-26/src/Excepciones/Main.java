package Excepciones;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pablo", "Cristaldo", "33333333", 1000d);

        try {
            cliente1.comprar(50);
        } catch (ClienteException e) {

            e.printStackTrace();
        }

        try {
            cliente1.comprar(2000);
        } catch (ClienteException e) {
            e.printStackTrace();
        }

        System.out.println(cliente1.getSaldoEnCuenta());

        try {
            cliente1.saldarDeuda(500);
        } catch (ClienteException e) {
            e.printStackTrace();
        }

        cliente1.setSaldoEnCuenta(0);
        try {
            cliente1.saldarDeuda(500);
        } catch (ClienteException e) {
            e.printStackTrace();
        }


    }
}
