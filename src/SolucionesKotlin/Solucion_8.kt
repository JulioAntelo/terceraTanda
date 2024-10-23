package SolucionesKotlin

fun Solucion_8() {
    println("dame una palabra o frase para contarle las vocales")
    val frase = readln()
    var contador = 0
    for (i in frase){
        if (i == 'a' || i == 'e'|| i == 'i'|| i == 'o'|| i == 'u'){
            contador +=1
        }
    }
    println("el numero total de vocales que hay son $contador")
}