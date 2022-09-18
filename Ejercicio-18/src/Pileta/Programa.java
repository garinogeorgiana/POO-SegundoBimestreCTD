package Pileta;

public class Programa {
    public static void main(String[] args) {
        Socio socio1 = new Socio("1", "Pablo", "Basquet", 100d);
        SocioHabilitado socio2 = new SocioHabilitado("2", "Leonel", "Natacion", 100d, 50d);
        SocioHabilitado socio3 = new SocioHabilitado("3", "Cristal", "Tenis", 100d, 50d);

        System.out.println("El socio sin estar hablitado paga " + socio1.costoMensual());
        System.out.println("El socio habilitado paga " + socio2.costoMensual());

        socio3.setHabilitado(false);
        System.out.println("El socio no habilitado paga "+socio3.costoMensual());

    }
}
