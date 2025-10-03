# Práctica: RecyclerView con Edición y Long Click

## Descripción
El RecyclerView es un componente avanzado que permite mostrar listas de datos de manera eficiente. Cada elemento se representa mediante un ViewHolder, y el Adapter se encarga de enlazar los datos con las vistas.

En esta práctica aprenderás a:
1. Detectar un long click en un elemento.
2. Mostrar un menú de opciones (Editar o Eliminar).
3. Abrir un diálogo personalizado para editar los datos de un usuario (nombre, edad, correo).
4. Actualizar el RecyclerView con notifyItemChanged().

---

## Cómo ejecutar
1. Abrir todos los archivos correspondientes en un proyecto de AndroidStudio.  
2. Ejecutar el archivo **MainActivity** con el botón **Run**

---

## Preguntas de reflexión
1. ¿Qué diferencia hay entre notifyItemRemoved(), notifyItemInserted() y notifyItemChanged()?

notifyItemRemoved() avisa que un elemento fue eliminado en esa posición. 
notifyItemInserted() avisa que se ha agregado un nuevo elemento en esa posición.
notifyItemChanged() avisa que un elemento ya existente fue modificado.

2. ¿Por qué es necesario validar bindingAdapterPosition != RecyclerView.NO_POSITION?

Ya que la posición del item puede quedar desincronizada, y si no validamos que esta sincronizado la aplicación puede crashear.

3. ¿Qué ventajas tiene usar un diálogo frente a abrir una nueva pantalla para editar?

Es más rápido y sencillo, mejora la usabilidad ya que todo se hace en la misma ventana lo que hace que el usuario no pierda el contexto de la lista; puede editar y volver sin recargar.
