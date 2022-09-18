package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantas horas trabajo Julieta en la semana?");
        double horasTrabajadas = scanner.nextDouble();


        System.out.println("El sueldo de esa semana es de: $"+calcularSalarioSemanal(horasTrabajadas)+" Pesos");

    }

    public static double calcularSalarioSemanal(double horasTrabajadas) {

        double precioHora = 875.00;
        double resultado = 0.0;

        if (horasTrabajadas > 40) {
            double horasExtra = horasTrabajadas - 40;
            resultado = ((horasExtra * precioHora) * 1.5) + (40 * precioHora);
        }else {
            resultado = horasTrabajadas * precioHora;
        }

        return resultado;
    }
}
