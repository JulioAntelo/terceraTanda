package SolucionesJava;

import java.util.Scanner;

public class Solucion_8 {
    public static void solucion_8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame una palabra o frase para contarle las vocales");
        String frase = scanner.nextLine();
        int contador = 0;
        for (char i : frase.toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                contador++;
            }
        }
        System.out.println("el numero total de vocales que hay son " + contador);
    }
}
