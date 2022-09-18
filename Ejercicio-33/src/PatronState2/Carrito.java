package PatronState2;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    Estado estado;
    List<Producto> productos = new ArrayList<>();


    public Carrito(){
        estado = new Vacio(this);
    }

    public void agregarProducto(Producto producto) {
        estado.agregarProducto(producto);
    }


    public void cancelarCarrito() {
        estado.cancelarCarrito();
    }


    public void volverAlPuntoAnterior() {
        estado.volverAlPuntoAnterior();
    }


    public void siguienteEstado() {
        estado.siguienteEstado();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
