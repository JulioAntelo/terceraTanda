package SolucionesJava;

import java.util.Scanner;

public class Solucion_1 {
    public static void Solucion_1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre);
    }
}
