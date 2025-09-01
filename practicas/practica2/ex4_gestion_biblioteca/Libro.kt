// clase Libro, especificacion de Material

class Libro(
    titulo: String,
    autor: String,
    anioPublicacion: Int,
    val genero: String,
    val numPaginas: Int
): Material(titulo, autor, anioPublicacion) {
    override fun mostrarDetalles() {
        println("=== LIBRO ===")
        println("TITULO: $titulo")
        println("AUTOR: $autor")
        println("AÑO PUBLICACION: $anioPublicacion")
        println("GENERO: $genero")
        println("NUMERO DE PAGINAS: $numPaginas\n")
    }
}