package Observer;

public class Seguidor implements Observador {
    private String nombre;
    private String apellido;
    private int cantNotificaciones;

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantNotificaciones = 0;
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

    public int getCantNotificaciones() {
        return cantNotificaciones;
    }

    public void setCantNotificaciones(int cantNotificaciones) {
        this.cantNotificaciones = cantNotificaciones;
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println(notificacion);
        cantNotificaciones++;
    }
}
