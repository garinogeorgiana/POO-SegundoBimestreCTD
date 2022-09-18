package Ejercicio15;

public class Articulo {
    private String titulo;
    private String tema;
    private String autor;
    private String fecha;

    public Articulo(String titulo, String tema, String autor, String fecha) {
        this.titulo = titulo;
        this.tema = tema;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String prepararTextoSegunNorma(String tipo){
        return "¡¡¡"+tipo.toUpperCase()+"!!!";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
