package Navetur;

public class Yate extends Embarcacion implements Comparable {
    private int cantCamarotes;

    public Yate(double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate yateParam = (Yate) o;
        int respuesta = 0;
        if (cantCamarotes > yateParam.cantCamarotes) {
            respuesta = 1;
        }
        if (cantCamarotes < yateParam.cantCamarotes) {
            respuesta = -1;
        }
        return respuesta;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }
}
