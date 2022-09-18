package ServicioReparacion;

public class EnReparacion implements Estado {
    Reparacion reparacion;

    public EnReparacion(Reparacion rep) {
        reparacion = rep;
        System.out.println("");
        System.out.println("Nombre del Articulo: " + reparacion.getArticulo());
        System.out.println("Estado: En reparacion.");
        System.out.println("Presupuesto: " + reparacion.getPresupuesto());
        System.out.println("Direccion del envio: " + reparacion.getDireccion());
        System.out.println("");
    }

    @Override
    public void cambiarDireccion(String nuevaDireccion) throws Exception {
        throw new Exception("Error, el producto esta en la etapa de Reparacion, la direcion solo puede ser cambiada en la etapa de Envio.");

    }

    @Override
    public void darValorPresupusto(double valor) throws Exception {
        throw new Exception("Error, el presupuesto inicial ya fue calculado en la etapa anterior, solo es posible modificarlo añadiendo el valor de nuevos repuestos.");
    }

    @Override
    public void pasarSigPaso() throws Exception {
        reparacion.setEstado(EstadoFactory.getInstance().crearEstado("envio",reparacion));

    }

    @Override
    public void agregarRepuesto(double valor) {
        reparacion.setPresupuesto(reparacion.getPresupuesto() + valor);
        System.out.println("Se agrego un repuesto con un valor añadido para el presupuesto original de: "+valor+", ahora el monto del presupuesto asciende a: "+reparacion.getPresupuesto());
    }

    public Reparacion getReparacion() {
        return reparacion;
    }

    public void setReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }
}
