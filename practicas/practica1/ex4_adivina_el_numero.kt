// Problema:
// Se tiene que implementar una funcion que genera un numero random del 1 al 30, que el usuario tiene que adivinar
// en 5 intentos y ademas se le tiene que brindar pistas que indiquen si el numero a adivinar es mayor o menor
// Autor: Piero Fabricio Poblete Andía
// Fecha Creacion: 24/08/25
// Fecha Ult. Modificacion: 24/08/25

import kotlin.random.Random // se importa para la utilizacion de la funcion random

fun randomNum(): Int { // funcion que genera el numero a adivinar del 1 al 30
    return Random.nextInt(1, 31)
}

fun menuAdivNum(): Unit { // funcion que provee menu
    var elecU: Int = 0
    var numIntentos: Int = 5
    var win: Boolean = false // indicador de si el usuario gano o perdio
    val numeroAdv: Int = randomNum()
    println("ADIVINA EL NUMERO")
    println("=================")
    for(i in 1..numIntentos){
        println("INTENTO: $i de $numIntentos")
        elecU = readln().toInt()
        when {
            elecU < numeroAdv -> println("PISTA: El numero a adivinar es MAYOR")
            elecU > numeroAdv -> println("PISTA: El numero a adivinar es MENOR")
            elecU == numeroAdv -> {
                println("GANASTE")
                win = true
                break
            }
        }
    }
    if (win==false) {
        println("GAME OVER")
    }
}

fun main(){
    menuAdivNum()
}