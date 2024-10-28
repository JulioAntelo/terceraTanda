package SolucionesJava;

import java.util.Scanner;

public class Solucion_11 {
    public static void solucion_11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero para ver su secuencia de Fibonacci:");
        int numero = scanner.nextInt();
        System.out.println("introduce el numero de repeticiones de la secuencia que desea:");
        int totalSecuencia = scanner.nextInt();

        int anterior = numero;
        int actual = numero;

        for (int i = 1; i <= totalSecuencia; i++) {
            System.out.println(anterior);
            int siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
    }
}
