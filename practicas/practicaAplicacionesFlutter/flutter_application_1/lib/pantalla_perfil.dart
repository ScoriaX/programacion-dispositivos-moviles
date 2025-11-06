import 'package:flutter/material.dart';

class PantallaPerfil extends StatelessWidget {
  const PantallaPerfil({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Mi Perfil'),
        centerTitle: true,
        elevation: 2,
        backgroundColor: Colors.blue,
        foregroundColor: Colors.white,
      ),
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            // Imagen
            Center(
              child: CircleAvatar(
                radius: 60,
                backgroundImage: NetworkImage(
                  'https://i.pravatar.cc/300', // Imagen de internet
                ),
              ),
            ),

            const SizedBox(height: 20),

            // Nombre
            const Text(
              'Piero Poblete',
              style: TextStyle(fontSize: 26, fontWeight: FontWeight.bold),
            ),

            const SizedBox(height: 10),

            // Descripción
            const Text(
              'Estudiante de Ingeniería de Software. Apasionado por Flutter y el análisis de datos.',
              textAlign: TextAlign.center,
            ),

            const SizedBox(height: 30),

            // Información de contacto
            const Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Icon(Icons.email, color: Colors.blue),
                SizedBox(width: 10),
                Text('piero@example.com'),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
