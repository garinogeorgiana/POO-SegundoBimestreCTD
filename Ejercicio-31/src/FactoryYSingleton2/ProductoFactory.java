package FactoryYSingleton2;

public class ProductoFactory {

    private static ProductoFactory instance = null;

    private ProductoFactory() {

    }

    public static ProductoFactory getInstance() {
        if (instance == null) {
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto crearProducto(String tipo){
        Producto resultado = null;
        switch (tipo){
            case "CAJA10X10":
                resultado = new Caja(10,10,10);
                break;
            case "PELOTAFULTBOL":
                resultado = new Pelota(11);
                break;
            case "PELOTATENIS":
                resultado = new Pelota(0.32);
                break;
        }
        return resultado;

    }


}
