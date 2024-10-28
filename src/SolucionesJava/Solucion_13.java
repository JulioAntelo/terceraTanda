package SolucionesJava;

import java.util.Scanner;

public class Solucion_13 {
    public static void solucion_13() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime un anime que quieras añadir con la siguiente informacion en el orden dado: \n nombre:");
        String nombre = scanner.nextLine();

        System.out.println("episodios:");
        int episodios = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("genero:");
        String genero = scanner.nextLine();

        Anime anime = new Anime(nombre, episodios, genero);

        System.out.println("el anime dado es: " + anime.nombre + ", con " + anime.episodios + " capitulos y de genero " + anime.genero);
    }
}

class Anime {
    String nombre;
    int episodios;
    String genero;

    Anime(String Nombre, int Episodios, String Género) {
        this.nombre = Nombre;
        this.episodios = Episodios;
        this.genero = Género;
    }
}