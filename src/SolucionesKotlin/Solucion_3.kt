package SolucionesKotlin

fun Solucion_3 (){
    println("dime el radio del circulo del que quieres saber el area")
    val radio = readln().toInt()
    println("el area del circulo es: ${calcularAreaCirculo(radio)}")
}

fun calcularAreaCirculo(num:Int):Double{
    return num*num*3.14
}