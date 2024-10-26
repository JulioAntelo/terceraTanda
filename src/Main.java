import java.util.Scanner;

import SolucionesJava.*;

import static SolucionesKotlin.Solucion_2Kt.Solucion_2;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenuEjercicios();

            int numeroEjercicio = Integer.parseInt(scanner.nextLine());

            switch (numeroEjercicio) {
                case 1 -> new Solucion_1();
                case 2 -> new Solucion_2();
                case 3 -> new Solucion_3();
                case 4 -> new Solucion_4();
                case 5 -> new Solucion_5();
                case 6 -> new Solucion_6();
                case 7 -> new Solucion_7();
                case 8 -> new Solucion_8();
                case 9 -> new Solucion_9();
                case 10 -> new Solucion_10();
                case 11 -> new Solucion_11();
                case 12 -> new Solucion_12();
                case 13 -> new Solucion_13();
                case 14 -> new Solucion_14();
                case 15 -> {
                    System.out.println("Ha cerrado el programa.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.\n");
            }
        }
    }

    public static void mostrarMenuEjercicios() {
        System.out.println("\n--- Menú de Ejercicios ---");
        for (int i = 1; i <= 15; i++) {
            if (i == 15) {
                System.out.println(i + ". Salir");
            } else {
                System.out.println(i + ". Ejercicio " + i);
            }
        }
        System.out.print("Selecciona una opción: ");
    }




}