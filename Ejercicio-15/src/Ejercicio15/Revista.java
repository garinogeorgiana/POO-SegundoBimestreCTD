package Ejercicio15;

import java.util.List;

public class Revista {
    private String nombre;
    private String codigo;
    private String periodicidad;
    private Edicion edicion;

    public Revista(String nombre, String codigo, String periodicidad, Edicion edicion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.periodicidad = periodicidad;
        this.edicion = edicion;
    }

    public void prepararNuevaRevista(){
        System.out.println("Se prepara la nueva revista");
    }

    public void confeccionarSeccion(){
        System.out.println("Se confecciona la seccion");
    }
}
