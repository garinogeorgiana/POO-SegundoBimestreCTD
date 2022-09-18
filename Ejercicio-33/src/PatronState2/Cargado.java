package PatronState2;

public class Cargado implements Estado {
    private Carrito carrito;

    public Cargado(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Cargado");
    }

    public void agregarProducto(Producto producto) {
        carrito.getProductos().add(producto);
        System.out.println("Se agrego el producto : "+producto.getDescripcion());
    }

    @Override
    public void cancelarCarrito() {
        carrito.setEstado(new Vacio(carrito));
        System.out.println("El carrito se esta vaciando.");
    }

    @Override
    public void volverAlPuntoAnterior() {
        carrito.setEstado(new Vacio(carrito));
        System.out.println("Volviendo al estado anterior.");
        System.out.println("El carrito se esta vaciando.");
    }

    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Pagando(carrito));
        System.out.println("El carrito avanza al siguiente estado (Pagando)");
    }
}
