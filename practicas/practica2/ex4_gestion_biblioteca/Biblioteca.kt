// Interfaz IBiblioteca que provee los metodos a utilizar

interface IBiblioteca {
    fun regisMaterial(material: Material)
    fun regisUsuario(usuario: Usuario)
    fun regisPrestamo(usuario: Usuario, material: Material)
    fun regisDevolucion(usuario: Usuario, material: Material)
    fun verMaterialesDispo()
    fun verReservados(usuario: Usuario)
}

// Clase Biblioteca que hereda los metodos de la interfaz IBiblioteca y los define
class Biblioteca : IBiblioteca {
    private val materials = mutableListOf<Material>()
    private val usuarios = mutableMapOf<Usuario, MutableList<Material>>()

    override fun regisMaterial(material: Material) {
        materials.add(material)
        println("Se registro MATERIAL: ${material.titulo} de ${material.autor}")
    }
    override fun regisUsuario(usuario: Usuario) {
        usuarios.putIfAbsent(usuario, mutableListOf())
        println("Se registro USUARIO: ${usuario.nombre} ${usuario.apellido}")
    }
    override fun regisPrestamo(usuario: Usuario, material: Material) {
        if(materials.contains(material)){
            materials.remove(material)
            usuarios[usuario]?.add(material)
            println("PRESTAMOS: Se presto ${material.titulo} a el usuario ${usuario.nombre} ${usuario.apellido}")
        } else {
            println("No se pudo realizar el prestamo")
        }
    }
    override fun regisDevolucion(usuario: Usuario, material: Material) {
        if(usuarios[usuario]?.contains(material) == true){
            usuarios[usuario]?.remove(material)
            materials.add(material)
            println("DEVOLUCION: Se devolvio ${material.titulo} por el usuario ${usuario.nombre} ${usuario.apellido}")
        } else {
            println("No se pudo realizar la devolucion")
        }
    }
    override fun verMaterialesDispo() {
        println("MATERIAL DISPONIBLE:")
        if(materials.isNotEmpty()){
            for (material in materials) {
                material.mostrarDetalles()
            }
        } else {
            println("No hay ningun material disponible")
        }
    }
    override fun verReservados(usuario: Usuario) {
        println("= RESERVADOS DEL USUARIO: ${usuario.nombre} ${usuario.apellido}\n")
        val materiales = usuarios[usuario]
        if(materiales != null){
            materiales.forEach { it.mostrarDetalles() }
        } else {
            println("No hay ningun material")
        }
    }
}