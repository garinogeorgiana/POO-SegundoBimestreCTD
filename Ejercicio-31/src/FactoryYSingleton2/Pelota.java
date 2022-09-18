package FactoryYSingleton2;

public class Pelota extends Producto{

    private double radio;

    public Pelota(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return ((Math.PI/3)*4)*(radio*radio*radio);
    }
}
