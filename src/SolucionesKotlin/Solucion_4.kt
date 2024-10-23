package SolucionesKotlin

import kotlin.random.Random


fun Solucion_4 (){
    val numeroAleatorio = Random.nextInt(0,101)
    println("intenta adivinar un numero aleatorio entre 0-100")
    while(true){
        var numeroUsuario = readln().toInt()

        if (numeroUsuario == numeroAleatorio){
            println("has acertado")
            break
        }else println("intentalo de nuevo")

        if (numeroUsuario>numeroAleatorio){
            println("el numero es mas grande que el numero aleatorio")
        }else println("el numero es mas pequeño que el numero aleatorio")
    }
}