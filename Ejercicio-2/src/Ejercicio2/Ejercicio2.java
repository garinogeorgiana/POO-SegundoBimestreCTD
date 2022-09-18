package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre, apellido, iniciales;
        int dia, mes, anio;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido = scanner.nextLine();
        System.out.println("Ingrese el dia de su nacimiento: ");
        dia = scanner.nextInt();
        System.out.println("Ingrese el mes de su nacimiento: ");
        mes = scanner.nextInt();
        System.out.println("Ingrese el año de su nacimiento: ");
        anio = scanner.nextInt();

        System.out.println("Ficha");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + nombre);
        System.out.println("Iniciales: " + obtenerIniciales(nombre, apellido));
        System.out.println("Nacimiento: " + formatoFecha(dia, mes, anio));

    }

    public static String formatoFecha(int d, int m, int a) {
        return d + "/" + m + "/" + a;
    }

    public static String obtenerIniciales(String n, String a) {
        String respuesta = "";
        char inicialNombre = n.charAt(0);
        char inicialApellido = a.charAt(0);
        respuesta = respuesta + inicialNombre + inicialApellido;
        return respuesta.toUpperCase();
    }


}
