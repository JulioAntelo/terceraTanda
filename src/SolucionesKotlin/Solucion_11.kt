package SolucionesKotlin

fun Solucion_11 (){
    println("introduce un numero para ver su secuencia de Fibonacci: ")
    val numero = readln().toInt()
    println("introduce el numero de repeticiones de la secuencia que desea: ")
    val totalSecuencia = readln().toInt()
    var anterior = numero
    var actual = numero
    for (i in 1..totalSecuencia) {
        println(anterior)
        val siguiente = anterior + actual
        anterior = actual
        actual = siguiente
    }
}