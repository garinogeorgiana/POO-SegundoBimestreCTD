package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        String nombreCan;
        double cantidadCan;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del can");
        nombreCan = scanner.nextLine();
        System.out.println("Ingrese la cantidad de comida que el can necesita en KG");
        cantidadCan = scanner.nextDouble();

        System.out.println(nombreCan+" precisa "+ cuantosPaquetes(cantidadCan)+" paquetes.");
    }

    public static int cuantosPaquetes(double totalKg) {
        int cantPaquetes = 0;
        Scanner scan = new Scanner(System.in);
        double kgPaquete;

        while (totalKg > 0) {
            System.out.println("Ingrese el peso del siguiente paquete");
            kgPaquete = scan.nextDouble();
            totalKg = totalKg - kgPaquete;
            cantPaquetes++;
        }
        return cantPaquetes;
    }



}
