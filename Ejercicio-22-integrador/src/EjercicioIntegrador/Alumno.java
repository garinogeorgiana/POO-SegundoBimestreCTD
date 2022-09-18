package EjercicioIntegrador;

public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;

    public Alumno(String nom, String ape, int leg){
        this.nombre = nom;
        this.apellido = ape;
        this.legajo = leg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
