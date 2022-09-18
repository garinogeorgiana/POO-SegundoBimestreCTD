import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer numero.");
        Integer numero1 = scanner.nextInt();
        System.out.println("Introduzca el segundo numero.");
        Integer numero2 = scanner.nextInt();
        System.out.println("Introduzca el tercer numero.");
        Integer numero3 = scanner.nextInt();

        if (numero1 == numero2 && numero1 == numero3) {
            System.out.println("Los tres numeros son iguales, con lo cual el numero maximo es " + numero1);
            System.out.println("Gracias por participar.");
        } else {
            System.out.println("El numero maximo de los tres que ingreso es " + maximoEntreTresNumeros(numero1, numero2, numero3));
            System.out.println("Gracias por participar.");
        }

    }

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {
        if (unNumeroA >= unNumeroB && unNumeroA >= unNumeroC) {
            return unNumeroA;
        } else if (unNumeroB >= unNumeroA && unNumeroB >= unNumeroC) {
            return unNumeroB;
        } else {
            return unNumeroC;
        }
    }

}