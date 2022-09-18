package ServicioReparacion;

public class Reparacion {
    private String articulo;
    private double presupuesto;
    private String direccion;
    private Estado estado;

    public Reparacion(String articulo, String direccion) throws Exception {
        this.articulo = articulo;

        this.direccion = direccion;
        estado = EstadoFactory.getInstance().crearEstado("presupuesto", this);
    }

    public void cambiarDireccion(String nuevaDireccion) throws Exception {
        estado.cambiarDireccion(nuevaDireccion);
    }

    ;

    public void darValorPresupusto(double valor) throws Exception {
        estado.darValorPresupusto(valor);
    }

    ;

    public void pasarSigPaso() throws Exception {
        estado.pasarSigPaso();
    }

    ;

    public void agregarRepuesto(double valor) throws Exception {
        estado.agregarRepuesto(valor);
    }

    ;

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
