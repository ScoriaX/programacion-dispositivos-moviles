// Problema:
// Se desea realizar una evaluacion de nivel de rendimiento y el calculo de dinero que recibira
// el usuario, despues de leer su puntuacion y salario mensual
// Autor: Piero Fabricio Poblete Andía
// Fecha Creacion: 23/08/25
// Fecha Ult. Modificacion: 24/08/25

fun calcRend(num: Int) : String{ // funcion que devuelve a que nivel pertenece el usuario a partir de su puntuacion
    return when{
        num in 0..3 -> "Inaceptable"
        num in 4..6 -> "Aceptable"
        num in 7..10 -> "Meritorio"
        else -> "Fuera de rango"
    }
}

fun calcDinero(salario: Int, ren: Int) : Double{ // funcion que calcula el total de dinero a recibir a partir de su puntuacion y salario mensual
    val pun = ren.toDouble() / 10.0
    //println(salario * pun)
    return salario * pun
}

fun principal() : Unit{ // funcion en la que se lee puntuacion, salario y que devuelve el nivel de rendimiento, total de dinero
    var salario: Int = 0
    var ren: Int = 0
    println("Ingrese su puntuacion:")
    ren = readln().toInt()
    println("Ingrese su salario mensual")
    salario = readln().toInt()
    println("Nivel de Rendimiento: ${calcRend(ren)}")
    println("Cantidad de Dinero Recibo: ${calcDinero(salario, ren)}")
}

fun main(){
    principal()
}
