package ejercicio13;

public class Programa {
    public static void main(String[] args) {
        Impresora impre1= new Impresora("PrimerImpresora", "Cable Ethernet", "05/09/2001");
        Impresora impre2= new Impresora("SegundaImpresora","USB");

        impre1.imprimir("Hoy es 24 de Septiembre");
        impre1.cagarPapel(100);
        impre1.imprimir("Hoy es 24 de Septiembre");

        impre2.imprimir("Mañana es 25 de Septiembre.");

    }
}
