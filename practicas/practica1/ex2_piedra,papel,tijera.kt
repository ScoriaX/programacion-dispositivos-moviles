// Problema:
// Clasico juego de Piedra, Papel y Tijeras.
// El usuario puede eleguir y la maquina responde con una eleccion random
// 1 = Piedra
// 2 = Papel
// 3 = Tijera
// Piedra gana a Tijera, pierde con Papel
// Papel gana a Piedra, pierde con Tijera
// Tijera gana a Papel, pierde con Piedra
// Autor: Piero Fabricio Poblete Andía
// Fecha Creacion: 24/08/25
// Fecha Ult. Modificacion: 24/08/25

import kotlin.random.Random // se importa para la utilizacion de la funcion random

fun random(): Int { // funcion que genera el numero que simula la eleccion de la maquina
    return Random.nextInt(1, 4)
}

fun versus(eleccionUsuario: Int, eleccionMaquina: Int): String { // funcion que simula el versus entre la eleccion del usuario y la de la maquina
    println("USUSARIO VS MAQUINA = RESULTADO")
    println("===============================")
    return when{
        eleccionUsuario == eleccionMaquina -> "EMPATE"
        eleccionUsuario == 1 && eleccionMaquina == 3 -> "Piedra VS Tijera = GANASTE"
        eleccionUsuario == 1 && eleccionMaquina == 2 -> "Piedra VS Papel = PERDISTE"
        eleccionUsuario == 2 && eleccionMaquina == 1 -> "Papel VS Piedra = GANASTE"
        eleccionUsuario == 2 && eleccionMaquina == 3 -> "Papel VS Tijerea = PERDISTE"
        eleccionUsuario == 3 && eleccionMaquina == 2 -> "Tijera VS Papel = GANASTE"
        eleccionUsuario == 3 && eleccionMaquina == 1 -> "Tijera VS Piedra = PERDISTE"
        else -> "ERROR"
    }
}

fun menuPpt(): Unit { // funcion que provee menu al juego de piedra, papel o tijera
 var eleU = 0
    while(eleU != 4){
        println("PIEDRA, PAPEL O TIJERA")
        println("======================")
        println("1: Piedra")
        println("2: Papel")
        println("3: Tijera")
        println("4: Salir")
        eleU = readln().toInt()

        if (eleU == 4) {
            println("Saliendo del juego...")
            break
        }

        val eleM: Int = random()
        val result: String = versus(eleU, eleM)
        println(result)
        println("======================\n")
    }
}

fun main(){
    menuPpt()
}