package SolucionesKotlin

fun Solucion_10() {
    println("dame una temperatura para cambiarla")
    val temp = readln().toDouble()
    println("a que desea convertirla? \n " +
            "1.-> Celsius \n" +
            "2.-> Fahrenheit")
    val decision = readln().toInt()
    if (decision==1){
        aCelsius(temp)
    }else if (decision==2){
        aFahrenheit(temp)
    }else println("el numero introducido no es correcto, vuelva a elegir actividad")
}

fun aCelsius(temperatura: Double){
    val cambio = (temperatura-32) * (5/9)
    println(cambio)
}

fun aFahrenheit(temperatura: Double){
    val cambio = temperatura*(5/9)+32
    println(cambio)
}