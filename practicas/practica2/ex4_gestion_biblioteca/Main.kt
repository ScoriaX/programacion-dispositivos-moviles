// Problema:
// Se desea realizar un gestor de biblioteca, que separe principalmente material y usuario.
// Ademas sea capaz de realizar prestamos y devoluciones. De cierto material a cierto usuario.
// Autor: Piero Fabricio Poblete Andía
// Fecha Creacion: 01/09/25
// Fecha Ult. Modificacion: 01/09/25

fun main() {
    val biblioteca = Biblioteca()

    // Crear materiales
    val libro1 = Libro("El Quijote", "Cervantes", 1605, "Novela", 863)
    val libro2 = Libro("1984", "George Orwell", 1949, "Distopía", 328)
    val revista1 = Revista("National Geographic", "Varios", 2023, "1234-5678", 50, "NatGeo")

    // Crear usuarios
    val usuario1 = Usuario("Piero", "Poblete", 20)
    val usuario2 = Usuario("Coco", "Limon", 2)

    biblioteca.regisMaterial(libro1)
    biblioteca.regisMaterial(libro2)
    biblioteca.regisMaterial(revista1)
    biblioteca.regisUsuario(usuario1)
    biblioteca.regisUsuario(usuario2)

    biblioteca.verMaterialesDispo()

    biblioteca.regisPrestamo(usuario1, libro1)
    biblioteca.regisPrestamo(usuario2, revista1)
    biblioteca.regisPrestamo(usuario2, libro2)

    biblioteca.verReservados(usuario1)
    biblioteca.verReservados(usuario2)

    biblioteca.regisDevolucion(usuario2, revista1)

    biblioteca.verReservados(usuario1)
    biblioteca.verReservados(usuario2)
}