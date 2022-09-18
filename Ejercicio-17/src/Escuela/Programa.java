package Escuela;

import java.time.LocalTime;

public class Programa {
    public static void main(String[] args) {
        Estudiante estudiande1 = new Estudiante("Pablo", LocalTime.of(17,30,00),"E1");
        Profesor profesor1 = new Profesor("Andres",LocalTime.of(18,30,00),"P1","Lic. en Telecomunicaicones", 2d);
        Administrativo administrativo1 = new Administrativo("Marcela",LocalTime.of(19,00,00),"A1","Tesorero");

        estudiande1.estudiar();
        profesor1.darCLase();
        administrativo1.administrar();

    }
}
