package FinalPoo;

public class PizzaSimple extends Pizza {

    private double precioBase;
    private boolean esGrande;

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isEsGrande() {
        return esGrande;
    }

    public void setEsGrande(boolean esGrande) {
        this.esGrande = esGrande;
    }

    @Override
    public double calcularPrecio() {
        double precio = 0.0;
        if (esGrande){
            precio+=precioBase*2;
        }
        else {
            precio+=precioBase;
        }
        return precio;
    }
}
