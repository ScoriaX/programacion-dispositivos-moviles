# Práctica 4: Ciclo de Vida de una Activity en Android

## Descripción
En esta práctica se realiza una introducción a las diferentes etapas llamadas ciclo de vida, las cuales son manejadas por el sistema operativo. Y veremos como el ciclo de vida es esencial para crear aplicaciones eficientes y robustas.

---

## Cómo ejecutar
1. Abrir todos los archivos correspondientes en un proyecto de AndroidStudio.  
2. Ejecutar el archivo **MainActivity** con el botón **Run**

---

## Preguntas de reflexión
1. ¿Qué sucede si no usamos onSaveInstanceState? ¿Por qué se pierde el contador?

Sucede que la información que permanece solo en memoria se pierde si es que se destruye la actividad en la que esta. El contador se pierde ya que es información que vive solo en una instancia de MainActivity, la solución es guardarla utilizando un onSaveInstanceState.

2. ¿Por qué Android destruye y vuelve a crear la Activity al rotar la pantalla?

Porque al rotar la configuración de los recursos cambian, y para asegurarse de que se usen adecuadamente la aplicación destruye la activity y la crea de nuevo.

3. ¿En qué casos prácticos usarías onPause y onStop en una aplicación real?

onPause:
Cuando el usuario pausa un video, para detener procesos livianos.
onStop:
Cuando el usuario desea guardar cambios permanentes, o liberar recursos pesados.
