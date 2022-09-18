package Composiote;

public abstract class Elemento {
    private String nombre;

    public Elemento(String nom) {
        nombre = nom;
    }

    public abstract double calcularPrecio();
    public abstract String mostrarNombre();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
