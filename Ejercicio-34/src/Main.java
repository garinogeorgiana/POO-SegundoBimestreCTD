import ServicioReparacion.EnReparacion;
import ServicioReparacion.EstadoFactory;
import ServicioReparacion.Reparacion;

public class Main {
    public static void main(String[] args) throws Exception {
        Reparacion reparacion = new Reparacion("Batidora","Calle falsa 1234");
        reparacion.darValorPresupusto(100);
        //reparacion.cambiarDireccion("asd");
        reparacion.pasarSigPaso();
        reparacion.agregarRepuesto(50);
        reparacion.agregarRepuesto(25);
        //reparacion.darValorPresupusto(175);
        reparacion.pasarSigPaso();
        reparacion.cambiarDireccion("Avenida Siempre Viva 742");
        //reparacion.agregarRepuesto(2);
        reparacion.pasarSigPaso();
        //reparacion.pasarSigPaso();

        //EnReparacion testException = (EnReparacion) EstadoFactory.getInstance().crearEstado("asdasdsa",reparacion);

        //Las lineas comentadas son para probar las excepciones.


    }
}
