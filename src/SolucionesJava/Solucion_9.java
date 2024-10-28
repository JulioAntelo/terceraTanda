package SolucionesJava;

import java.util.Scanner;

public class Solucion_9 {
    public static void solucion_9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame un numero para ver si es primo:");
        int numero = scanner.nextInt();

        if (numero < 2) {
            System.out.println("el numero " + numero + " no es primo");
            return;
        }

        boolean Primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                Primo = false;
                break;
            }
        }

        if (Primo) {
            System.out.println("el numero es primo");
        } else {
            System.out.println("el numero no es primo");
        }
    }
}
