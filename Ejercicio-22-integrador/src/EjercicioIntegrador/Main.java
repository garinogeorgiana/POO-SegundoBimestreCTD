package EjercicioIntegrador;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Pablo","Cristaldo",1);
        Parcial parcial1 = new Parcial("Examen 1","bla bla bla",8,alumno1,1);
        Final final1 = new Final("Examen Final 1","ble ble ble",9,alumno1,7d,"expocom");

        Alumno alumno2 = new Alumno("Leonel","Fernandez",2);
        Final final2 = new Final("Examen Final 1","ble ble ble",3,alumno2,2d,"expocom");

        System.out.println("¿Puede recuperar con la cantidad default de intentos realizados que es 0?.");
        System.out.println(parcial1.sePuedeRecuperar());
        parcial1.setNroDeReintento(3);

        System.out.println("");
        System.out.println("¿Puede recuperar si seteamos la cantidad de intentos en 3 realizados?.");
        System.out.println(parcial1.sePuedeRecuperar());

        System.out.println("");
        System.out.println("¿Esta aprobado con dos notas de 8 y 9 que promedian?.");
        System.out.println(parcial1.estaAprobado());

        System.out.println("");
        System.out.println("¿Esta aprobado con dos notas de 3 y 2 que promedian?.");
        System.out.println(final2.estaAprobado());

        System.out.println("");
        System.out.println("Comparamos si el alumno 1 con notas 8 y 9 es mayor que el alumno 2 con notas 3 y 2.");
        System.out.println(final1.compareTo(final2));




    }
}
