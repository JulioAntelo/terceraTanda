package SolucionesJava;

import java.util.Scanner;

public class Solucion_12 {
    public static void solucion_12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("que numero desea invertir");
        String numero = scanner.nextLine();
        String reversed = new StringBuilder(numero).reverse().toString();
        System.out.println(reversed);
    }
}
