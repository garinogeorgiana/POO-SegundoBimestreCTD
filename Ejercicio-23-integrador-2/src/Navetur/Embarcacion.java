package Navetur;

public abstract class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    //eslora es la longitud de un barco desde popa a proa.
    private double eslora;

    public Embarcacion(double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public double calcularMontoAlquiler() {
        double valor = precioBase;
        if (anioFabricacion > 2020) {
            valor += valorAdicional;
        }
        return valor;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
}
