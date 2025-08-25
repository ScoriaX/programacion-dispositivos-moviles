// Problema:
// Calculadora elemental, puede realizar operaciones de suma, resta, multiplicacion y division
// utilizando dos numeros
// Autor: Piero Fabricio Poblete Andía
// Fecha Creacion: 24/08/25
// Fecha Ult. Modificacion: 24/08/25

fun sum(a: Int, b: Int) = a+b
fun resta(a: Int, b: Int) = a-b
fun mul(a: Int, b: Int) = a*b
fun div(a: Int, b: Int) = a / b
// funciones de operaciones elementales

fun menuCalc(){ // funcion que provee menu a la calculadora
    var eleU = 0
    while(eleU != 4){
        println("==== Menú ====")
        println("1: Suma")
        println("2: Resta")
        println("3: Multiplicacion")
        println("4: Division")
        println("5: Salir")
        eleU = readln().toInt()

        if (eleU == 5) {
            println("Saliendo de la calculadora...")
            break
        }

        println("Ingrese el primer numero:")
        val num1: Int = readln().toInt()
        println("Ingrese el segundo numero:")
        val num2: Int = readln().toInt()

        var result: Int = 0

        when(eleU){
            1 -> result = sum(num1, num2)
            2 -> result = resta(num1, num2)
            3 -> result = mul(num1, num2)
            4 -> result = div(num1, num2)
        }

        println("El RESULTADO es: $result")
    }
}

fun main(){
    menuCalc()
}