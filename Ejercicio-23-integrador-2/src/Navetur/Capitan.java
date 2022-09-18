package Navetur;

public class Capitan {
    private String nombre;
    private String apellido;
    private int matricula;

    public Capitan(String nom, String ape, int mat) {
        this.nombre = nom;
        this.apellido = ape;
        this.matricula = mat;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
