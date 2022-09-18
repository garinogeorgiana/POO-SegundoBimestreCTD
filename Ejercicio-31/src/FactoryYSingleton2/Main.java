package FactoryYSingleton2;

public class Main {
    public static void main(String[] args) {
        Caja caja = (Caja)ProductoFactory.getInstance().crearProducto("CAJA10X10");
        Pelota pelotaFutbol = (Pelota) ProductoFactory.getInstance().crearProducto("PELOTAFULTBOL");
        Pelota pelotaTenis = (Pelota) ProductoFactory.getInstance().crearProducto("PELOTATENIS");

        System.out.println("Volumen de una caja: "+ caja.calcularEspacio()+"cm cubicos");
        System.out.println();
        System.out.println("Volumen de una pelota de futbol: "+pelotaFutbol.calcularEspacio()+"cm cubicos");
        System.out.println();

        Almacen almacen = new Almacen();
        almacen.getProductos().add(caja);
        almacen.getProductos().add(pelotaFutbol);
        System.out.println("El espacio necesario en el almacen es de: "+almacen.calcularEspacioNecesario()+"cm cubicos");
        
    }
}
