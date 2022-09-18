package PatronState2;

public interface Estado {
    void agregarProducto(Producto producto);
    void cancelarCarrito();
    void volverAlPuntoAnterior();
    void siguienteEstado();
}
