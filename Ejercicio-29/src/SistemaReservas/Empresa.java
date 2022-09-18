package SistemaReservas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Reserva> reservas = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public int cantVecesRecorrida(String estacion) throws EmpresaException{
        if (estacion.equals("Buenos Aires") ||estacion.equals("Lujan") ||estacion.equals("Mercedes") ||estacion.equals("Suipacha") ||estacion.equals("Chivilcoy") ||estacion.equals("Alberti") ||estacion.equals("Bragado")){
            int vecesVisitada = 0;
            for (Reserva res : reservas) {
                if (res.getRecorrido().getDestino().equals(estacion) || res.getRecorrido().getPartida().equals(estacion)) {
                    vecesVisitada++;
                }
            }
            return vecesVisitada;
        }else {
            throw new EmpresaException("Nombre de la estacion invalida.");
        }

    }

    public double recaudacionTotal() {
        double recaudacion = 0;
        for (Reserva res : reservas) {
            if ((res.getRecorrido().getPartida().equals("Buenos Aires") && res.getRecorrido().getDestino().equals("Bragado")) || (res.getRecorrido().getPartida().equals("Bragado") && res.getRecorrido().getDestino().equals("Buenos Aires"))) {
                recaudacion += (Reserva.precioBoleto - (Reserva.precioBoleto * Reserva.descuento) / 100);
            }else {
                recaudacion+= Reserva.precioBoleto;
            }
        }
        return recaudacion;
    }

    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
