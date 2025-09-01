// Problema:
// Se desea diseñar una clase para Cuenta Bancaria, que tenga saldo y un limite de retiro,
// se debe poder realizar retiros de la cuenta siempre y cuando no excedan el limite de retiro.
// Autor: Piero Fabricio Poblete Andía
// Fecha Creacion: 01/09/25
// Fecha Ult. Modificacion: 01/09/25

import javax.naming.Name

class CuentaBancaria(val name: String, private var _saldo: Int, private var _limitRetiro: Int) {

    var saldo: Int
    get() = _saldo
    set(value) {
        require(value>=0) { "Saldo debe ser MAYOR a 0" }
        _saldo = value
    }

    var limitRetiro: Int
    get() = _limitRetiro
    set(value) {
        require(value>=0) { "Limit Retiro debe ser MAYOR a 0" }
        _limitRetiro = value
    }

    fun retiro(monto: Int){
        require(monto>=0) { "El MONTO tiene que ser MAYOR a 0" }
        require(monto <= limitRetiro) { "Se excedio el LIMITE DE RETIRO: $limitRetiro" }
        require(monto <= saldo) { "SALDO INSUFICIENTE $saldo" }

        saldo -= monto
        println("=== RETIRO ===")
        println("CUENTA: $name")
        println("MONTO RETIRADO: $monto")
        println("SALDO RESTANTE: $saldo")
        println("==============\n")
    }

    fun infoCuentaBancaria(){
        println("==== INFO ====")
        println("CUENTA: $name")
        println("SALDO: $saldo")
        println("LIMITE DE RETIRO: $limitRetiro")
        println("==============\n")
    }
}

fun main() {
    val cuenta = CuentaBancaria("Piero", 10000, 200)

    cuenta.infoCuentaBancaria()
    cuenta.retiro(100) // realizando retiro

    println("Nombre Cuenta: ${cuenta.name}")
    println("Saldo: ${cuenta.saldo}")
    println("Limite de Retiro: ${cuenta.limitRetiro}\n")

    cuenta.saldo = 2000 // actualizando saldo
    cuenta.limitRetiro = 500 // actualizando limite de retiro

    cuenta.infoCuentaBancaria()
}