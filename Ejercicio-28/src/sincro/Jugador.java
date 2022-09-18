package sincro;

public class Jugador {
    private String posicion;
    private String apellido;
    private int nroCamiseta;

    public Jugador(String a, int n, String p) {
        this.posicion = p;
        this.apellido = a;
        this.nroCamiseta = n;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }
}
