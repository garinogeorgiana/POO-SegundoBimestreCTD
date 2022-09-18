package SistemaReservas;

public class Main {
    public static void main(String[] args) throws RecorridoException, EmpresaException {
        Recorrido recorrido1 = new Recorrido("Buenos Aires", "Chivilcoy");
        Recorrido recorrido2 = new Recorrido("Mercedes", "Chivilcoy");
        Recorrido recorrido3 = new Recorrido("Suipacha", "Chivilcoy");
        Recorrido recorrido4 = new Recorrido("Buenos Aires", "Bragado");
        Recorrido recorrido5 = new Recorrido("Bragado", "Buenos Aires");
        Recorrido recorrido6 = new Recorrido("Alberti", "Lujan");
        Recorrido recorrido7 = new Recorrido("Buenos Aires", "Alberti");

        Reserva reserva1 = new Reserva("1A", 18, recorrido1);
        Reserva reserva2 = new Reserva("SA", 11, recorrido2);
        Reserva reserva3 = new Reserva("1SA", 1, recorrido3);
        Reserva reserva4 = new Reserva("3A", 1, recorrido4);
        Reserva reserva5 = new Reserva("5A", 1, recorrido5);
        Reserva reserva6 = new Reserva("6A", 34, recorrido6);
        Reserva reserva7 = new Reserva("1A", 32, recorrido7);
        Reserva reserva8 = new Reserva("1sds", 114, recorrido7);
        Reserva reserva9 = new Reserva("1A456456", 2, recorrido2);
        Reserva reserva10 = new Reserva("12", 33, recorrido2);
        Reserva reserva11 = new Reserva("1A", 2, recorrido1);
        Reserva reserva12 = new Reserva("1A", 1, recorrido1);
        Reserva reserva13 = new Reserva("SDA", 15, recorrido3);
        Reserva reserva14 = new Reserva("123", 18, recorrido1);
        Reserva reserva15 = new Reserva("143243A", 42, recorrido5);

        Empresa empresa = new Empresa("Pablo Rieles");
        empresa.addReserva(reserva1);
        empresa.addReserva(reserva2);
        empresa.addReserva(reserva3);
        empresa.addReserva(reserva4);
        empresa.addReserva(reserva5);
        empresa.addReserva(reserva6);
        empresa.addReserva(reserva7);
        empresa.addReserva(reserva8);
        empresa.addReserva(reserva9);
        empresa.addReserva(reserva10);
        empresa.addReserva(reserva11);
        empresa.addReserva(reserva12);
        empresa.addReserva(reserva13);
        empresa.addReserva(reserva14);
        empresa.addReserva(reserva15);

        System.out.println("Checkeamos que se aplica el descuento baja las condiciones deseadas");
        System.out.println(reserva3.recaudacionReserva());
        System.out.println(reserva4.recaudacionReserva());
        System.out.println("");

        System.out.println("Chequeamos que se calculen las veces que un tren pasa por una estacion");
        System.out.println(empresa.cantVecesRecorrida("Alberti"));
        System.out.println("");

        System.out.println("Calculamos la recaudacion total");
        Recorrido recorridoEspecial = new Recorrido("Buenos Aires", "Chivilcoy");
        Reserva reservaEspecial1 = new Reserva("1A", 5, recorridoEspecial);
        Reserva reservaEspecial2 = new Reserva("SA", 5, recorridoEspecial);
        Empresa empresaEspecial = new Empresa("Empresa Especial Checkeadora");
        empresaEspecial.addReserva(reservaEspecial1);
        empresaEspecial.addReserva(reservaEspecial2);
        System.out.println(empresaEspecial.recaudacionTotal());


        /*
        Estas tres lineas puede generar los throws para checkear de las excepciones, una para cada throw de los creados.
        Recorrido checkeoError1 = new Recorrido("Buenos Aires", "Chiy");
        Recorrido checkeoError2 = new Recorrido("Buenos", "Chivilcoy");
        System.out.println(empresa.cantVecesRecorrida("Ali"));
        */

    }
}
