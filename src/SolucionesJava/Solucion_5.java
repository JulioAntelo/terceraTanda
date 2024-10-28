package SolucionesJava;

import java.util.Scanner;

public class Solucion_5 {
    public static void solucion_5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime el numero de la tabla que quieres ver");
        int tabla = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * tabla);
        }
    }
}
