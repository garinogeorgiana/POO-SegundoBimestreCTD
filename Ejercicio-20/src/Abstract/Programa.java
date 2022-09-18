package Abstract;

public class Programa {
    public static void main(String[] args) {

        ImpresoraCannon i1 = new ImpresoraCannon();
        System.out.println(i1.imprimir());
        ImpresoraEpson i2 = new ImpresoraEpson();
        System.out.println(i2.imprimir());

        Impresora i3 = new ImpresoraCannon();
        System.out.println(i3.imprimir());
    }
}
