package ServicioReparacion;

public class EstadoFactory {
    private static EstadoFactory instance = null;

    private EstadoFactory() {

    }



    public static EstadoFactory getInstance() {
        if (instance == null) {
            instance = new EstadoFactory();
        }
        return instance;
    }

    public Estado crearEstado(String tipo, Reparacion reparacion) throws Exception {
        Estado respuesta = null;
        switch (tipo.toLowerCase()) {
            case "presupuesto":
                respuesta = new EnPresupuesto(reparacion);
                break;
            case "reparacion":
                respuesta = new EnReparacion(reparacion);
                break;
            case "envio":
                respuesta = new ParaEnvio(reparacion);
                break;
            case "finalizado":
                respuesta = new Finalizado(reparacion);
                break;
            default:
                throw new Exception("No encontramos este objeto para construir, digito un String incorrecto");
        }
        return respuesta;
    }
}
