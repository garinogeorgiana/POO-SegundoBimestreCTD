import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a comparar si dos textos son iguales, pero vamos a discriminar mayusculas y minusculas!");
        System.out.println("Escriba la primer cadena de texto");
        String texto1 = scanner.nextLine();
        System.out.println("Escriba la segunda cadena de texto");
        String texto2 = scanner.nextLine();

        if (cadenasDeTextoDistintas(texto1.toLowerCase(),texto2.toLowerCase())) {
            System.out.println("Son distintas!");
        }else{
            System.out.println("Son iguales!");
        }
        ;
    }

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        return !unTextoA.equals(unTextoB);
    }
}
