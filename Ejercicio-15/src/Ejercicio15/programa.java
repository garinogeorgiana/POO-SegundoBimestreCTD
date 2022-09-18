package Ejercicio15;

public class programa {
    public static void main(String[] args) {

        Articulo articulo = new Articulo("historias de pablo", "Programacion", "Pablin", "ayer y hoy");
        Edicion edicion = new Edicion(1, "15 de febrero", 55.50, articulo);
        Revista revista = new Revista("Pablitobook", "123312", "semanal",edicion);
        Editorial pabloEditorial = new Editorial("Editorial Pablo", "123456", "calle 1", "pablo@editorial.com", revista);

        System.out.println("responsabilidades de editorial");
        pabloEditorial.investigarElMercado();
        pabloEditorial.producirRevista();
        System.out.println("");
        System.out.println("responsabilidades de revista");
        revista.confeccionarSeccion();
        revista.prepararNuevaRevista();
        System.out.println("");
        System.out.println("responsabilidades de edicion");
        edicion.gestionarISBN();
        System.out.println("");
        System.out.println("responsabilidades de articulo");
        System.out.println(articulo.prepararTextoSegunNorma("texto para preparar"));

    }
}
