package Pileta;

public class Socio {
    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numero, String nombre, String actividad, Double cuota) {
        numeroSocio = numero;
        this.nombre = nombre;
        this.actividad = actividad;
        cuotaMensual = cuota;
    }

    public Double costoMensual(){
        return cuotaMensual;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}
