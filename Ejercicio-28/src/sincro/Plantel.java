package sincro;

import java.util.ArrayList;
import java.util.List;

public class Plantel {
    private String nombre;
    private List<Jugador> jugadores;

    public Plantel(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public int cantJugadores(String posicion) throws Exception {
        int contador = 0;
        if (posicion.equals("ARQUERO") || posicion.equals("MEDIOCAMPISTA") || posicion.equals("DELANTERO") || posicion.equals("DEFENSOR")) {
            for (Jugador jug : jugadores) {
                if (jug.getPosicion() == posicion) {
                    contador++;
                }
            }
        } else {
            throw new Exception("La posicion ingresada no es correcta. Error");
        }
        return contador;
    }

    public ArrayList<Jugador> obtenerReservas() {
        ArrayList<Jugador> reservas = new ArrayList<>();
        for (int i = jugadores.size() - 1; i >= jugadores.size() - 5; i--) {
            reservas.add(jugadores.get(i));
        }
        return reservas;
    }


}
