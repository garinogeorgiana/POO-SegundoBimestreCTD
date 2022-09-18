package ServicioReparacion;

public class Finalizado extends Exception implements Estado {
    Reparacion reparacion;

    public Finalizado(Reparacion rep){
        reparacion = rep;
        System.out.println("");
        System.out.println("Nombre del Articulo: "+reparacion.getArticulo());
        System.out.println("Estado: Finalizado.");
        System.out.println("Presupuesto: "+reparacion.getPresupuesto());
        System.out.println("Direccion del envio: "+reparacion.getDireccion());
        System.out.println("");
    }

    @Override
    public void cambiarDireccion(String nuevaDireccion) throws Exception {
        throw new Exception("Error, el producto ya fue enviado, no se puede cambiar la direccion en este estado.");

    }

    @Override
    public void darValorPresupusto(double valor) throws Exception {
        throw new Exception("Error, el producto ya finalizo su reparacion y fue enviado, no puede cambiarse el presupuesto.");

    }

    @Override
    public void pasarSigPaso() throws Exception {
        throw new Exception("Error, el producto ya finalizo su reparacion y fue enviado, no hay un paso siguiente.");
    }

    @Override
    public void agregarRepuesto(double valor) throws Exception {
        throw new Exception("Error, el producto ya finalizo su reparacion y fue enviado, no es posible agregar repuestos.");

    }

    public Reparacion getReparacion() {
        return reparacion;
    }

    public void setReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }
}
