package PatronState2;

public class Pagando implements Estado{
    private Carrito carrito;

    public Pagando(Carrito carrito){
        this.carrito = carrito;
        System.out.println("Pagando");
    }

    public void agregarProducto(Producto producto) {
        System.out.println("El carrito no acepta mas productos, esta a la espera de aceptacion de compra.");
    }

    @Override
    public void cancelarCarrito() {
        carrito.setEstado(new Vacio(carrito));
        System.out.println("El carrito se esta vaciando.");
    }

    @Override
    public void volverAlPuntoAnterior() {
        carrito.setEstado(new Cargado(carrito));
        System.out.println("Volviendo al estado anterior.");
        System.out.println("El carrito ahora esta cargando.");
    }

    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Cerrado(carrito));
        System.out.println("El carrito avanza al siguiente estado (Cerrado)");
    }
}
