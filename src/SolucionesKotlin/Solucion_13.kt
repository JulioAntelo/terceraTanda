package SolucionesKotlin

fun Solucion_13 (){
    println("dime un anime que quieras añadir con la siguiente informacion en el orden dado: \n nombre:")
    val nombre = readln()
    println("episodios: ")
    val episodios = readln().toInt()
    println("genero: ")
    val genero = readln()

    val anime = anime(nombre, episodios, genero)
    println("el anime dado es: ${anime.nombre}, con ${anime.episodios} capitulos y de genero ${anime.genero}")
}

class anime(Nombre: String, Episodios: Int, Género: String){
    val nombre = Nombre
    val episodios = Episodios
    val genero = Género
}