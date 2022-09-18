package Equipo;

public class Jugador implements Comparable<Jugador> {
    private int nroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    public Jugador(int nroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }


    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    @Override
    public int compareTo(Jugador o) {
        int resultado = 0;
        if (o.nroCamiseta > getNroCamiseta()) {
            resultado = -1;
        }
        if (o.nroCamiseta < getNroCamiseta()) {
            resultado = 1;
        }
        return resultado;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+" - Nro: "+ nroCamiseta;
    }
}
