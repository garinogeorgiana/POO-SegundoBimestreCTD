package Escuela;

import java.time.LocalTime;

public class Estudiante extends Persona{
    private String legajoAcademico;

    public Estudiante(String nombre, LocalTime horarioSalida, String legajoAcademico) {
        super(nombre, horarioSalida);
        this.legajoAcademico = legajoAcademico;
    }

    public void estudiar(){
        System.out.println("El estudiante "+getNombre()+ " esta estudiando");
    }

    public String getLegajoAcademico() {
        return legajoAcademico;
    }

    public void setLegajoAcademico(String legajoAcademico) {
        this.legajoAcademico = legajoAcademico;
    }
}
