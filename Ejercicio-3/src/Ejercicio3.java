import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que numero queres saber si es primo?");
        int numeroIngresado = scanner.nextInt();

        esPrimo(numeroIngresado);
    }

    public static void esPrimo(int numero){
        int contadorDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero%i == 0) {
                contadorDivisores++;
            }
        }
        if (contadorDivisores != 2){
            System.out.println("No es primo");
        } else {
            System.out.println("Si es primo");
        }



    }


}

