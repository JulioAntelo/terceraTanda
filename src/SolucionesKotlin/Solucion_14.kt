package SolucionesKotlin

fun Solucion_14 () {
    val juego1 = Videojuego("The Legend of Zelda", "Nintendo Switch", 50)
    val juego2 = Videojuego("God of War", "PlayStation 4", 40)
    val juego3 = Videojuego("Halo", "Xbox One", 30)


    val listaJueguitos: MutableList<Videojuego> = mutableListOf()
    listaJueguitos.add(juego1)
    listaJueguitos.add(juego2)
    listaJueguitos.add(juego3)


    fun añadirjueguito() {
        println("introduce el título del videojuego:")
        val nombre = readln()
        println("introduce la plataforma del videojuego:")
        val plataforma = readln()
        println("introduce las horas jugadas:")
        val horasJugadas = readln().toInt()

        listaJueguitos.add(Videojuego(nombre, plataforma, horasJugadas))
        println("Videojuego '$nombre' añadido al inventario.\n")
    }

    fun verjueguitos() {
        for (juego in listaJueguitos) {
            println("Título: ${juego.titulo}, Plataforma: ${juego.plataforma}, Horas Jugadas: ${juego.horasJugadas}")
        }
    }

    fun imprimirMenu() {
        return println(
            "Que desea hacer? \n " +
                    "1.-> agregar juego \n" +
                    "2.-> mostrar juegos \n" +
                    "3 .-> eliminar juego por nombre"
        )
    }
    fun eliminarJueguito() {
        println("Introduce el título del videojuego a eliminar:")
        val nombre = readln()
        val juegoAEliminar = listaJueguitos.find { it.titulo == nombre }
        listaJueguitos.remove(juegoAEliminar)
    }
    while (true) {
        imprimirMenu()
        when (readln().toIntOrNull()) {
            1 -> añadirjueguito()
            2 -> verjueguitos()
            3 -> eliminarJueguito()
            4 -> {
                println("Saliendo del programa.")
                break
            }

            else -> println("Opción no válida. Inténtalo de nuevo.\n")
        }
    }
}
class Videojuego(val titulo: String, val plataforma: String, var horasJugadas: Int) {


}