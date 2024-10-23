package SolucionesKotlin

fun Solucion_2(){
    println("Introduce un numero")
    val numero = readln().toInt()
    parImpar(numero)
}

fun parImpar(num: Int){
    if (num%2 == 0){
        println("es par")
    }else println("es impar")
}

