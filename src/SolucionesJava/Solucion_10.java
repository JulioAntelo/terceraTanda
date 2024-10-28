package SolucionesJava;

import java.util.Scanner;

public class Solucion_10 {
    public static void solucion_10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame una temperatura para cambiarla");
        double temp = scanner.nextDouble();
        System.out.println("a que desea convertirla? \n1.-> Celsius \n2.-> Fahrenheit");
        int decision = scanner.nextInt();

        if (decision == 1) {
            aCelsius(temp);
        } else if (decision == 2) {
            aFahrenheit(temp);
        } else {
            System.out.println("el numero introducido no es correcto, vuelva a elegir actividad");
        }
    }

    public static void aCelsius(double temperatura) {
        double cambio = (temperatura - 32) * 5.0 / 9.0;
        System.out.println(cambio);
    }

    public static void aFahrenheit(double temperatura) {
        double cambio = temperatura * 9.0 / 5.0 + 32;
        System.out.println(cambio);
    }
}
