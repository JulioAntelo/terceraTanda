package SolucionesKotlin

fun Solucion_9 (){
    println("dame un numero para ver si es primo: ")
    val numero = readln().toInt()
    if(numero <2){
        println("el numero $numero no es primo")
    }
    var Primo = true
    for (i in 2..numero){
        if (numero % i == 0){
            Primo = false
            break
        }
    }
    if (Primo == true){
        println("el numero no es primo")
    }else {
        println("el numero es primo")
    }
}