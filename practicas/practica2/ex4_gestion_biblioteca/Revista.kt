// clase Revista, especificacion de Material

class Revista (
    titulo: String,
    autor: String,
    anioPublicacion: Int,
    val issn: String,
    val volumen: Int,
    val editorial: String
): Material(titulo, autor, anioPublicacion) {
    override fun mostrarDetalles() {
        println("=== REVISTA ===")
        println("TITULO: $titulo")
        println("AUTOR: $autor")
        println("AÑO PUBLICACION: $anioPublicacion")
        println("ISSN: $issn")
        println("VOLUMEN: $volumen")
        println("EDITORIAL: $editorial\n")
    }
}