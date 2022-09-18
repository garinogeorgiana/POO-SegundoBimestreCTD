package Escuela;

import java.time.LocalTime;

public class Profesor extends Persona{
    private String legajoProfesor;
    private String titulo;
    private double antiguedadLaboral;

    public Profesor(String nombre, LocalTime horarioSalida, String legajoProfesor, String titulo, double antiguedadLaboral) {
        super(nombre, horarioSalida);
        this.legajoProfesor = legajoProfesor;
        this.titulo = titulo;
        this.antiguedadLaboral = antiguedadLaboral;
    }

    public void darCLase(){
        System.out.println("El profesor "+getNombre()+" empieza la clase");
    }

    public String getLegajoProfesor() {
        return legajoProfesor;
    }

    public void setLegajoProfesor(String legajoProfesor) {
        this.legajoProfesor = legajoProfesor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAntiguedadLaboral() {
        return antiguedadLaboral;
    }

    public void setAntiguedadLaboral(double antiguedadLaboral) {
        this.antiguedadLaboral = antiguedadLaboral;
    }
}
