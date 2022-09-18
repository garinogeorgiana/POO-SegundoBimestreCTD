package PatronState2;

public class Cerrado implements Estado{
    private Carrito carrito;

    public Cerrado(Carrito carrito){
        this.carrito = carrito;
        System.out.println("Cerrado");
    }

    public void agregarProducto(Producto producto) {
        System.out.println("El carrito esta cerrado, no pueden agregarse productos.");
    }

    @Override
    public void cancelarCarrito() {

        System.out.println("El carrito ya fue pagado, no se puede vaciar.");
    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("El carrito ya fue pagado, no puede volver al estado anterior.");
    }

    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Vacio(carrito));
        System.out.println("El carrito avanza al siguiente estado (Vacio)");
    }
}
