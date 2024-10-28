package SolucionesJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solucion_14 {
    public static void solucion_14() {
        Videojuego juego1 = new Videojuego("The Legend of Zelda", "Nintendo Switch", 50);
        Videojuego juego2 = new Videojuego("God of War", "PlayStation 4", 40);
        Videojuego juego3 = new Videojuego("Halo", "Xbox One", 30);
        List<Videojuego> listaJueguitos = new ArrayList<>();
        listaJueguitos.add(juego1);
        listaJueguitos.add(juego2);
        listaJueguitos.add(juego3);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            imprimirMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    añadirjueguito(listaJueguitos, scanner);
                    break;
                case 2:
                    verjueguitos(listaJueguitos);
                    break;
                case 3:
                    eliminarJueguito(listaJueguitos, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.\n");
            }
        }
    }

    private static void añadirjueguito(List<Videojuego> listaJueguitos, Scanner scanner) {
        System.out.println("introduce el título del videojuego:");
        String nombre = scanner.nextLine();
        System.out.println("introduce la plataforma del videojuego:");
        String plataforma = scanner.nextLine();
        System.out.println("introduce las horas jugadas:");
        int horasJugadas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        listaJueguitos.add(new Videojuego(nombre, plataforma, horasJugadas));
        System.out.println("Videojuego '" + nombre + "' añadido al inventario.\n");
    }

    private static void verjueguitos(List<Videojuego> listaJueguitos) {
        for (Videojuego juego : listaJueguitos) {
            System.out.println("Título: " + juego.titulo + ", Plataforma: " + juego.plataforma + ", Horas Jugadas: " + juego.horasJugadas);
        }
    }

    private static void eliminarJueguito(List<Videojuego> listaJueguitos, Scanner scanner) {
        System.out.println("Introduce el título del videojuego a eliminar:");
        String nombre = scanner.nextLine();
        Videojuego juegoAEliminar = null;
        for (Videojuego juego : listaJueguitos) {
            if (juego.titulo.equals(nombre)) {
                juegoAEliminar = juego;
                break;
            }
        }
        if (juegoAEliminar != null) {
            listaJueguitos.remove(juegoAEliminar);
            System.out.println("Videojuego '" + nombre + "' eliminado del inventario.\n");
        } else {
            System.out.println("No se encontró el videojuego con el título '" + nombre + "'.\n");
        }
    }

    private static void imprimirMenu() {
        System.out.println(
                "Que desea hacer? \n " +
                        "1.-> agregar juego \n" +
                        "2.-> mostrar juegos \n" +
                        "3.-> eliminar juego por nombre \n" +
                        "4.-> salir"
        );
    }
}

class Videojuego {
    String titulo;
    String plataforma;
    int horasJugadas;

    Videojuego(String titulo, String plataforma, int horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }
}
