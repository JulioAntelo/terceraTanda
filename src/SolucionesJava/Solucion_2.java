package SolucionesJava;

import java.util.Scanner;

public class Solucion_2 {
    public static void solucion_2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("introduce un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("el numero " + numero + " es par.");
        } else {
            System.out.println("el numero " + numero + " es impar.");
        }
    }
}
