import SolucionesKotlin.*
fun main() {
    while (true) {


        println("\n--- Menú de Ejercicios ---")
        println("1. Ejercicio 1")
        println("2. Ejercicio 2")
        println("3. Ejercicio 3")
        println("4. Ejercicio 4")
        println("5. Ejercicio 5")
        println("6. Ejercicio 6")
        println("7. Ejercicio 7")
        println("8. Ejercicio 8")
        println("9. Ejercicio 9")
        println("10. Ejercicio 10")
        println("11. Ejercicio 11")
        println("12. Ejercicio 12")
        println("13. Ejercicio 13")
        println("14. Ejercicio 14")
        println("15. Salir")
        print("Selecciona una opción: ")

        var numeroEjercicio = readln().toInt()

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