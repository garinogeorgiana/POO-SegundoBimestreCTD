package PuertoBuenosAires;

public class Main {
    public static void main(String[] args) {
        Contenedor cont1 = new Contenedor(1,"China",true);
        Contenedor cont2 = new Contenedor(22,"EEUU",false);
        Contenedor cont3 = new Contenedor(23,"Desconocida",false);
        Contenedor cont4 = new Contenedor(1515,"Canada",true);
        Contenedor cont5 = new Contenedor(2,"Brasil",false);
        Contenedor cont6 = new Contenedor(150,"Rusia",false);

        Puerto puerto1 = new Puerto("Puerto de Buenos Aires");
        puerto1.ingresarContenedor(cont1);
        puerto1.ingresarContenedor(cont2);
        puerto1.ingresarContenedor(cont3);
        puerto1.ingresarContenedor(cont4);
        puerto1.ingresarContenedor(cont5);
        puerto1.ingresarContenedor(cont6);

        System.out.println("Mostrar Contenedores en orden en base al numero de identificacion.");
        puerto1.mostrarContenedores();
        System.out.println("");

        System.out.println("Calculamos la cantidad de contenedores peligrosos que hay en el puerto.");
        System.out.println(puerto1.calcularContenedoresPeligrosos());
    }
}
