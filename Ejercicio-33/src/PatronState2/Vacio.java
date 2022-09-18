package PatronState2;

public class Vacio implements Estado {
    private Carrito carrito;

    public Vacio(Carrito carrito){
        this.carrito = carrito;
        System.out.println("Vacio");
    }

    @Override
    public void agregarProducto(Producto producto) {
        carrito.getProductos().add(producto);
        System.out.println("Se agrego el producto : "+producto.getDescripcion());
        carrito.setEstado(new Cargado(carrito));
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("El carrito ya se encuentra vacio.");
    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("No se puede voler a un punto anterior, ya que el carrito esta en su estado inicial. (vacio)");
    }

    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Cargado(carrito));
        System.out.println("El carrito avanza al siguiente estado (Cargando)");
    }
}
