package FactoryYSingleton2;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    List<Producto> productos = new ArrayList<>();

    public double calcularEspacioNecesario(){
        double espacio = 0;
        for (Producto prod:productos) {
            espacio+=prod.calcularEspacio();
        }
        return espacio;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
