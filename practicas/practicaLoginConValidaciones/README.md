# Práctica LCRUD: Listas Dinámicas y CRUD Local con Provider en Flutter
## Descripción
En esta práctica se implementará una aplicación Flutter que permita agregar, editar y eliminar usuarios utilizando el patrón MVVM con Provider, reforzando el manejo del estado, la UI dinámica y el trabajo con formularios.
---

## Cómo ejecutar
1. Abrir los archivos correspondientes en un proyecto de Flutter.  
2. Ejecutar el archivo **main.dart** con el botón **Run**

## Preguntas de reflexión

1. ¿Qué ventajas ofrece usar Provider frente a setState()?

- Provider permite una mejor separación entre la lógica de negocio y la interfaz, facilitando la reutilización del código.
- Optimiza el rendimiento, ya que solo los widgets que dependen del estado se reconstruyen, evitando redibujar toda la pantalla.
- Facilita el manejo de estados globales compartidos entre múltiples pantallas.

2. ¿Por qué es importante usar ChangeNotifier en el ViewModel?

- Porque ChangeNotifier permite que el ViewModel notifique automáticamente a los widgets cuando hay cambios en los datos.
- Esto mantiene la interfaz sincronizada con el estado sin tener que actualizar manualmente cada widget.
- Además, facilita el uso de `Provider` para escuchar cambios de manera reactiva.

3. ¿Qué sucedería si no se llamara a notifyListeners() después de editar un usuario?

- Los cambios realizados en los datos no se reflejarían en la interfaz, ya que los widgets no serían notificados.
- En otras palabras, el estado interno del ViewModel se actualizaría, pero la vista seguiría mostrando información antigua.
