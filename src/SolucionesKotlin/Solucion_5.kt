package SolucionesKotlin

fun Solucion_5 (){
    println("dime el numero de la tabla que quieres ver")
    var tabla = readln().toInt()
    for (i in 1..10){
        println(i*tabla)
    }
}