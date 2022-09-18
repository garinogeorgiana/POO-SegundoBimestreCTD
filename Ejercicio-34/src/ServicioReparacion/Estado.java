package ServicioReparacion;

public interface Estado {
    public void cambiarDireccion(String nuevaDireccion) throws Exception;

    public void darValorPresupusto(double valor) throws Exception;

    public void pasarSigPaso() throws Exception;

    public void agregarRepuesto(double valor) throws Exception;
}
