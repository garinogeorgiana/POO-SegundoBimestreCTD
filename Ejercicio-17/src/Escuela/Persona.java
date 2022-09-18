package Escuela;

import java.time.LocalTime;

public class Persona {
    private String nombre;
    private LocalTime horarioEntrada;
    private LocalTime horarioSalida;

    public Persona(String nombre, LocalTime horarioSalida) {
        this.nombre = nombre;

        this.horarioSalida = horarioSalida;

        this.horarioEntrada = LocalTime.of(9,00,00);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(LocalTime horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public LocalTime getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(LocalTime horarioSalida) {
        this.horarioSalida = horarioSalida;
    }
}
