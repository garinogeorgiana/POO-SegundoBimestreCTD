package Navetur;

public class Velero extends Embarcacion {
    private int cantMastiles;

    public Velero(double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantMastiles = cantMastiles;
    }

    public boolean esGrande() {
        if (cantMastiles > 4) {
            return true;
        } else {
            return false;
        }
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
}
