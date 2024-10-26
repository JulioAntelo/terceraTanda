import SolucionesKotlin.*
fun main() {
    while (true) {

        mostrarMenuEjercicios()

        val numeroEjercicio = readln().toInt()

        when (numeroEjercicio) {
            1 -> Solucion_1()
            2 -> Solucion_2()
            3 -> Solucion_3()
            4 -> Solucion_4()
            5 -> Solucion_5()
            6 -> Solucion_6()
            7 -> Solucion_7()
            8 -> Solucion_8()
            9 -> Solucion_9()
            10 -> Solucion_10()
            11-> Solucion_11()
            12-> Solucion_12()
            13-> Solucion_13()
            14-> Solucion_14()
        }
        if (numeroEjercicio == 15) {
            println("ha cerrado el programa")
            break
        }
    }
}

fun mostrarMenuEjercicios() {
    println("\n--- Menú de Ejercicios ---")
    for (i in 1..15) {
        if (i == 15) {
            println("$i. Salir")
        } else {
            println("$i. Ejercicio $i")
        }
    }
    print("Selecciona una opción: ")
}