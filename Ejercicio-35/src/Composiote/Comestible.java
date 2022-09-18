package Composiote;

public class Comestible extends Elemento{
private double precio;

    public Comestible(double precio, String nom) {
        super(nom);
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrarNombre() {
        return getNombre();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
