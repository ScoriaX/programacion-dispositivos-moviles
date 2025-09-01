// Problema:
// Se desea diseñar una clase para Productos, que tenga precio y descuento,
// se debe poder calcular el precio final despues de aplicar descuento.
// Autor: Piero Fabricio Poblete Andía
// Fecha Creacion: 01/09/25
// Fecha Ult. Modificacion: 01/09/25

class Producto(val name: String, private var _precio: Double, private var _descuento: Double ) {
    var precio: Double
    get() = _precio
    set(value) {
        require(value>=0) { "Precio debe ser MAYOR a 0" }
        _precio = value
    }

    var descuento: Double
    get() = _descuento
    set(value) {
        require(value>=0) { "Descuento debe ser MAYOR a 0" }
        require(value<=1) { "Precio debe ser MENOR a 1" }
        _descuento = value
    }

    fun calcDescuento(): Double {
        var resultado = precio * descuento
        return resultado
    }
}

fun main() {
    val producto = Producto("Lapicero", 100.0, 0.5)
    println("Nombre: ${producto.name}")
    println("Precio: ${producto.precio}")
    println("Descuento: ${producto.descuento}")
    println("DESCUENTO CALCULADO: ${producto.calcDescuento()}")
}