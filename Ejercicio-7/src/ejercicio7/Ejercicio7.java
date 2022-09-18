package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcionJugador = "";
        int opcionComputadora;
        System.out.println("¿Piedra Papel Tijeras Lagarto o Spock? en caso de no querer jugar escribe un asterisco ( * )");

        while (!(opcionJugador.equals("*"))) {

            opcionComputadora = (int) Math.ceil(Math.random() * 5);
            opcionJugador = scanner.nextLine();
            opcionJugador = opcionJugador.toLowerCase();


            switch (opcionJugador) {
                case "piedra":
                    System.out.println(cualGana(1, opcionComputadora));
                    System.out.println("El jugador selecciono piedra");
                    informarSeleccionComputadora(opcionComputadora);
                    cartel();
                    break;
                case "papel":
                    System.out.println(cualGana(2, opcionComputadora));
                    System.out.println("El jugador selecciono papel");
                    informarSeleccionComputadora(opcionComputadora);
                    cartel();
                    break;
                case "tijeras":
                    System.out.println(cualGana(3, opcionComputadora));
                    System.out.println("El jugador selecciono tijeras");
                    informarSeleccionComputadora(opcionComputadora);
                    cartel();
                    break;
                case "lagarto":
                    System.out.println(cualGana(4, opcionComputadora));
                    System.out.println("El jugador selecciono lagarto");
                    informarSeleccionComputadora(opcionComputadora);
                    cartel();
                    break;
                case "spock":
                    System.out.println(cualGana(5, opcionComputadora));
                    System.out.println("El jugador selecciono spock");
                    informarSeleccionComputadora(opcionComputadora);
                    cartel();
                    break;
                case "*":

                    break;
                default:
                    System.out.println("Escribio algo erroneo, recuerde que solo puede seleccionar su jugada escribiendo Piedra Papel Tijeras Lagarto o Spock.");
                    cartel();
                    break;
            }




        }
        System.out.println("Gracias por haber pasado");


    }

    public static void cartel(){
        System.out.println("Un 0 significa que es un empate, un 1 que ganaste y un 2 que perdiste!");
        System.out.println("¿Piedra Papel Tijeras Lagarto o Spock? en caso de no querer jugar escribe un asterisco ( * )");

    }

    public static int cualGana(int jugador, int computadora) {

        int resultado;

        //0 es empate - 1 gana el jugador - 2 gana la pc

        if (jugador == computadora) {
            resultado = 0;
        } else if (jugador == 1 && (computadora == 3 || computadora == 4)) {
            resultado = 1;
        } else if (jugador == 2 && (computadora == 1 || computadora == 5)) {
            resultado = 1;
        } else if (jugador == 3 && (computadora == 2 || computadora == 4)) {
            resultado = 1;
        } else if (jugador == 4 && (computadora == 2 || computadora == 5)) {
            resultado = 1;
        } else if (jugador == 5 && (computadora == 3 || computadora == 1)) {
            resultado = 1;
        } else {
            resultado = 2;
        }
        return resultado;
    }

    public static void informarSeleccionComputadora(int seleccion){
        switch (seleccion) {
            case 1 -> System.out.println("La computadora selecciono piedra");
            case 2 -> System.out.println("La computadora selecciono papel");
            case 3 -> System.out.println("La computadora selecciono tijera");
            case 4 -> System.out.println("La computadora selecciono lagarto");
            case 5 -> System.out.println("La computadora selecciono spock");
            default -> {
            }
        }
    }
}
