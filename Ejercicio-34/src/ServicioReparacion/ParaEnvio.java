package ServicioReparacion;

public class ParaEnvio implements Estado {
    Reparacion reparacion;

    public ParaEnvio(Reparacion rep) {
        reparacion = rep;
        System.out.println("");
        System.out.println("Nombre del Articulo: " + reparacion.getArticulo());
        System.out.println("Estado: Para Envio.");
        System.out.println("Presupuesto: " + reparacion.getPresupuesto());
        System.out.println("Direccion del envio: " + reparacion.getDireccion());
        System.out.println("");
    }

    @Override
    public void cambiarDireccion(String nuevaDireccion) {
        System.out.println("Se reemplazo la direccion '"+reparacion.getDireccion()+"' por '"+nuevaDireccion+"'.");
        reparacion.setDireccion(nuevaDireccion);
    }

    @Override
    public void darValorPresupusto(double valor) throws Exception {
        throw new Exception("Error, el producto esta en la etapa de Envio, el presupuesto inicial no puede modificarse.");

    }

    @Override
    public void pasarSigPaso() throws Exception {
        reparacion.setEstado(EstadoFactory.getInstance().crearEstado("finalizado",reparacion));
    }

    @Override
    public void agregarRepuesto(double valor) throws Exception {
        throw new Exception("Error, el producto esta en la etapa de Envio, Ya no pueden agregarse repuestos.");

    }

    public Reparacion getReparacion() {
        return reparacion;
    }

    public void setReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }
}
