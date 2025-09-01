// Problema:
// Se desea diseñar una clase abstracta de Figuras, que tenga metodos: area, perimetro y imprimir
// Se debe crear clases de Figuras especificas que hereden de Figuras (shape) y definan los metodos segun el caso
// como Cuadrado, Circulo y Rectangulo
// Autor: Piero Fabricio Poblete Andía
// Fecha Creacion: 01/09/25
// Fecha Ult. Modificacion: 01/09/25

import kotlin.math.PI

abstract class shape {
    abstract fun area(): Double
    abstract fun perimetro(): Double
    abstract fun imprimir(): Unit
}

class cuadrado(private val lado: Double) : shape() {
    override fun area(): Double {
        return lado * lado
    }
    override fun perimetro(): Double {
        return lado * 4
    }
    override fun imprimir(){
        println("== CUADRADO ==")
        println("AREA: ${area()}")
        println("PERIMETRO: ${perimetro()}\n")
    }
}

class circulo(private val radio: Double) : shape() {
    override fun area(): Double {
        return PI * radio * radio
    }
    override fun perimetro(): Double {
        return 2 * PI * radio
    }
    override fun imprimir(){
        println("== CIRCULO ==")
        println("AREA: ${area()}")
        println("PERIMETRO: ${perimetro()}\n")
    }
}

class rectangulo(private val base: Double, private val h: Double) : shape() {
    override fun area(): Double {
        return base * h
    }
    override fun perimetro(): Double {
        return base + h + base + h
    }
    override fun imprimir(){
        println("== RECTANGULO ==")
        println("AREA: ${area()}")
        println("PERIMETRO: ${perimetro()}\n")
    }
}

fun main() {
    val cuadrado = cuadrado(5.0)
    val rectangulo = rectangulo(4.0, 6.0)
    val circulo = circulo(3.0)

    cuadrado.imprimir()
    rectangulo.imprimir()
    circulo.imprimir()
}