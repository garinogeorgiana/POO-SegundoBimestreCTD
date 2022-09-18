package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos numeros primos queres conocer?");
        int numeroIngresado = scanner.nextInt();
        int contador = 1;
        int primosRequeridos = numeroIngresado;

        System.out.println("Los primeros "+numeroIngresado+" numeros primos son:");
        for (int numeroAProbar = 1; contador <= primosRequeridos; numeroAProbar++) {
            if (esPrimo(numeroAProbar) == 1){
                System.out.println(numeroAProbar);
                contador ++;
            }

        }

    }

    public static int esPrimo(int numero){
        int contadorDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero%i == 0) {
                contadorDivisores++;
            }
        }
        if (contadorDivisores != 2){
            return -1;
        } else {
            return 1;
        }



    }


}