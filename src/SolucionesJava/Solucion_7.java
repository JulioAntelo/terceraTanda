package SolucionesJava;
import java.util.Scanner;

public class Solucion_7 {
    public static void solucion_7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame una cadena para revertirla");
        String cadena = scanner.nextLine();
        String reversedCadena = new StringBuilder(cadena).reverse().toString();
        System.out.println(reversedCadena);
    }
}
