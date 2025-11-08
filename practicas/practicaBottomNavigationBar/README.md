# Práctica BNB: Navegación Inferior (BottomNavigationBar) 
## Descripción
En esta práctica se implementará un sistema de navegación por pestañas usando BottomNavigationBar en Flutter, comprendiendo la relación entre pantallas, navegación y estado.
---

## Cómo ejecutar
1. Abrir los archivos correspondientes en un proyecto de Flutter.  
2. Ejecutar el archivo **main.dart** con el botón **Run**

## Preguntas de reflexión
1. ¿Por qué se recomienda usar un StatefulWidget para manejar el índice de la pestaña seleccionada?
- Ya que nos ayuda a controlar el índice de la pestaña seleccionada y mostrar el contenido correspondiente, permitiendo la navegación fluida entre vistas sin recargar la aplicación.

2. ¿Qué ventajas ofrece separar cada pestaña en su propio widget o pantalla?
- Reutilización, rendimiento y escalabilidad.
- Cada pestaña seá la encargada de llevar su propia complejidad.

3. ¿Cómo cambia la navegación entre pantallas al usar rutas nombradas en lugar de Navigator.push()?
- Se vuelve más sencilla, y permite mayor organización.

4. ¿De qué forma el uso de Navigator.pop(context, data) facilita la comunicación entre pantallas?
- Facilita la comunicación ya que permite enviar datos de regreso, útil para editar información, seleccionar elementos o confirmar acciones.

5. ¿Qué posibles mejoras o extensiones podrías agregar a esta aplicación para hacerla más completa?
- Validación en el campo "nombre".
- Que el nombre del usuario sea persistente.
- Implementar rutas nombradas.

