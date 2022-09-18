package Escuela;

import java.time.LocalTime;

public class Administrativo extends Persona {
    private String legajoAdministrativo;
    private String cargo;

    public Administrativo(String nombre, LocalTime horarioSalida, String legajoAdministrativo, String cargo) {
        super(nombre, horarioSalida);
        this.legajoAdministrativo = legajoAdministrativo;
        this.cargo = cargo;
    }

    public void administrar(){
        System.out.println("El Empleado Administrativo "+getNombre()+" esta trabajando");
    }

    public String getLegajoAdministrativo() {
        return legajoAdministrativo;
    }

    public void setLegajoAdministrativo(String legajoAdministrativo) {
        this.legajoAdministrativo = legajoAdministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}