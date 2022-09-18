package EjercicioIntegrador;

public abstract class Examen {
    private String titulo;
    private String enuncaido;
    private double nota;
    private Alumno alumno;

    public boolean estaAprobado(){
        return nota>=4;
    }

    public Examen(String titulo, String enuncaido, double nota, Alumno alumno) {
        this.titulo = titulo;
        this.enuncaido = enuncaido;
        this.nota = nota;
        this.alumno = alumno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnuncaido() {
        return enuncaido;
    }

    public void setEnuncaido(String enuncaido) {
        this.enuncaido = enuncaido;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
