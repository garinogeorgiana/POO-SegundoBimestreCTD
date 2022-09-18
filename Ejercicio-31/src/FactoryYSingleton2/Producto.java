package FactoryYSingleton2;

public abstract class Producto {
    private double peso;



    public abstract double calcularEspacio();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
