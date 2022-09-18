package Equipo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void addJugador(Jugador j) {
        jugadores.add(j);
    }

    public int getCantidadJugadoresLesionados() {
        int cantLesionados = 0;
        for (Jugador jug : jugadores) {
            if (jug.isLesionado() && jug.isTitular()) {
                cantLesionados++;
            }
        }
        return cantLesionados;
    }

    /*public void mostrarJugadoresTitulares() {
        jugadores.sort(null);
        jugadores.forEach(jugador -> {
            if (jugador.isTitular()) {
                System.out.println(jugador.toString());
            }
        });
    }*/

    public void mostrarJugadoresTitulares() {
        jugadores.sort(null);
        for (Jugador jug : jugadores) {
            System.out.println(jug.toString());
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
