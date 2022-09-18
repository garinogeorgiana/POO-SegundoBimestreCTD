package Ejercicio15;

import java.util.List;

public class Edicion {
    private int numero;
    private String fecha;
    private double precio;
    private Articulo articulo;

    public Edicion(int numero, String fecha, double precio, Articulo articulo) {
        this.numero = numero;
        this.fecha = fecha;
        this.precio = precio;
        this.articulo = articulo;
    }

    public void gestionarISBN(){
        System.out.println("Se gestiono el ISBN");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
