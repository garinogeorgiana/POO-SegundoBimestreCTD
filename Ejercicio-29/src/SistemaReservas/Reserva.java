package SistemaReservas;

public class Reserva {
    private String codigo;
    private int cantPasajeros;
    public static double precioBoleto = 50d;
    private Recorrido recorrido;
    public static double descuento = 20;

    public Reserva(String codigo, int cantPasajeros, Recorrido recorrido) {
        this.codigo = codigo;
        this.cantPasajeros = cantPasajeros;
        this.recorrido = recorrido;
    }

    public double recaudacionReserva(){
        if ((recorrido.getDestino().equals("Buenos Aires") && recorrido.getPartida().equals("Bragado")) || (recorrido.getDestino().equals("Bragado") && recorrido.getPartida().equals("Buenos Aires"))){
            return (precioBoleto-(precioBoleto*(descuento/100)))*cantPasajeros;
        }else {
            return precioBoleto*cantPasajeros;
        }
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public static double getPrecioBoleto() {
        return precioBoleto;
    }

    public static void setPrecioBoleto(double precioBoleto) {
        Reserva.precioBoleto = precioBoleto;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        Reserva.descuento = descuento;
    }
}
