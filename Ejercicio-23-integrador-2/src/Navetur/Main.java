package Navetur;

public class Main {
    public static void main(String[] args) {

        Capitan capitan1 = new Capitan("Pablo","Cristaldo",01);
        Capitan capitan2 = new Capitan("Leonel","Fernandez",02);

        Yate yate1 = new Yate(500d,100d,2005,32d,4);
        Yate yate2 = new Yate(1000d,200d,2021,18d,6);
        Velero velero1 = new Velero(200d,50d,2021,10d,3);

        System.out.println("Comparamos la cantidad de camarotes para saber si es mas lujoso");
        System.out.println(yate1.compareTo(yate2));
        System.out.println("");

        System.out.println("Calculamos el alquiler del yate 1");
        System.out.println(yate1.calcularMontoAlquiler());
        System.out.println("");

        System.out.println("Checkeamos si el velero1 es grande");
        System.out.println(velero1.esGrande());
        System.out.println("");

        System.out.println("Calculamos el alquiler del velero1");
        System.out.println(velero1.calcularMontoAlquiler());

        System.out.println("");
        System.out.println("Fin del codigo");
    }
}
