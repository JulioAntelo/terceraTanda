package SolucionesJava;

import java.util.Scanner;

public class Solucion_3 {
    public static void solucion_3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("introduce el radio del circulo: ");
        double radio = scanner.nextInt();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);

    }
}
