package ServicioReparacion;

public class EnPresupuesto implements Estado {
    Reparacion reparacion;

    public EnPresupuesto(Reparacion rep) {
        reparacion = rep;
        System.out.println("");
        System.out.println("Nombre del Articulo: " + reparacion.getArticulo());
        System.out.println("Estado: En presupuesto.");
        System.out.println("Presupuesto: " + reparacion.getPresupuesto());
        System.out.println("Direccion del envio: " + reparacion.getDireccion());
        System.out.println("");
    }

    @Override
    public void cambiarDireccion(String nuevaDireccion) throws Exception {
        throw new Exception("Error, el producto esta en la etapa de presupuesto, la direcion solo puede ser cambiada en la etapa de Envio.");

    }

    @Override
    public void darValorPresupusto(double valor) {
        reparacion.setPresupuesto(valor);
        System.out.println("Se establecio el presupuesto de: " + valor + " para el articulo " + reparacion.getArticulo());
    }

    @Override
    public void pasarSigPaso() throws Exception {
        if (reparacion.getPresupuesto() > 0) {
            reparacion.setEstado(EstadoFactory.getInstance().crearEstado("reparacion",reparacion));
        } else throw new Exception("Error, el producto necesita un presupuesto antes de avanzar al siguiente paso.");
    }

    @Override
    public void agregarRepuesto(double valor) throws Exception {
        throw new Exception("Error, l producto esta en la etapa de presupuesto, solo pueden agregarse repuestos en la etapa de Reparacion");

    }

    public Reparacion getReparacion() {
        return reparacion;
    }

    public void setReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }
}
