package Ejercicio15;

import java.util.List;

public class Editorial {
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private Revista revista;

    public Editorial(String nombre, String telefono, String direccion, String email, Revista revista) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.revista = revista;
    }

    public void investigarElMercado(){
        System.out.println("Investigacion de mercado realizada");
    }

    public void producirRevista(){
        System.out.println("Se produjo la revista");
    }


}
