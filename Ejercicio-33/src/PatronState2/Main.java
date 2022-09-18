package PatronState2;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Producto producto1 = new Producto("Fideos",80d);
        Producto producto2 = new Producto("Queso", 150d);
        Producto producto3 = new Producto("Tomates", 12d);


        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        carrito.siguienteEstado();
        carrito.volverAlPuntoAnterior();
        carrito.cancelarCarrito();

        carrito.setEstado(new Cerrado(carrito));
        carrito.cancelarCarrito();
        carrito.volverAlPuntoAnterior();
        carrito.agregarProducto(producto1);
        carrito.siguienteEstado();

    }
}
