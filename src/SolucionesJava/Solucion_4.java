package SolucionesJava;

import java.util.Scanner;

public class Solucion_4 {
    public static void solucion_4() {
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 101);
        int intento;

        System.out.println("¡Adivina el número entre 1 y 100!");

        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor. ¡Inténtalo de nuevo!");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor. ¡Inténtalo de nuevo!");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        } while (intento != numeroAleatorio);

    }
}
